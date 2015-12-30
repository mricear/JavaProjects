package ProjectFiles;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedianFromDataStream {

	public static void main(String[] args) {
		MedianFinder o = new MedianFinder();
		o.addNum(1);
		System.out.println(o.findMedian());
		o.addNum(3);
		System.out.println(o.findMedian());
		o.addNum(5);
		System.out.println(o.findMedian());
		o.addNum(2);
		System.out.println(o.findMedian());
		o.addNum(10);
		System.out.println(o.findMedian());
		o.maxHeap.clear();
		o.minHeap.clear();
		o.addNum(5);
		o.addNum(7);
		o.addNum(2);
		o.addNum(1);
		o.addNum(4);
		System.out.println(o.findMedian());
	}

}

class MedianFinder {
	PriorityQueue<Integer> maxHeap;
	PriorityQueue<Integer> minHeap;
	
	MedianFinder(){
		minHeap = new PriorityQueue<Integer>();
		maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
	}
    // Adds a number into the data structure.
    public void addNum(int num) {
    	if(minHeap.size() == 0 && maxHeap.size() == 0){
    		minHeap.add(num);
    		return;
    	}
    	
    	if(maxHeap.size() > minHeap.size()){
    		if(num >= maxHeap.peek()){
    			minHeap.add(num);
    		}
    		else{
    			int maxHeapTop = maxHeap.remove();
    			minHeap.add(maxHeapTop);
    			maxHeap.add(num);
    		}
    	}
    	else if(maxHeap.size() == minHeap.size()){
    		if(num < maxHeap.peek()){
    			maxHeap.add(num);
    		}
    		else {
    			minHeap.add(num);
    		}
    	}
    	else{  //maxHeap.size() < minHeap.size())
    		if(num <= minHeap.peek()){
    			maxHeap.add(num);
    		}
    		else {
    			int minHeaptop = minHeap.remove();
    			maxHeap.add(minHeaptop);
    			minHeap.add(num);
    		}
    	}
    }

    // Returns the median of current data stream
    public double findMedian() {
    	if(minHeap.size() == 0 && maxHeap.size() == 0){
    		return 0;
    	}
    	if(minHeap.size() > maxHeap.size())
    		return minHeap.peek();
    	else if(minHeap.size() < maxHeap.size())
    		return maxHeap.peek();
    	else{
    		return ((double)maxHeap.peek() + (double)minHeap.peek()) / 2;
    	}
    }
}