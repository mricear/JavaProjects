package ProjectFiles;

import java.util.Stack;

public class LargestRecInHistogram {

	public static void main(String[] args) {
		System.out.println(largestRectangleArea(new int[]{5,6,7,9,2}));
		System.out.println(largestRectangleArea(new int[]{3,2,1,2,2,1,1,1}));
		System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
		System.out.println(largestRectangleArea(new int[]{2,6,7,9,95}));
		System.out.println(largestRectangleArea(new int[]{92,6,7,9,5}));
		System.out.println(largestRectangleArea(new int[]{5,4,1,2}));
		System.out.println(largestRectangleArea(new int[]{4,2,0,3,2,5}));
		System.out.println(largestRectangleArea(new int[]{3,6,5,6,1}));
	}

	public static int largestRectangleArea(int[] height) {
		if(height.length == 0)
			return 0;
		int result = 0;
		Stack<HistElement> s = new Stack<HistElement>();

		for(int i = 0; i < height.length; i++){
			int curElem = height[i];
			HistElement newel = new HistElement(curElem, i);
			if(s.isEmpty() || curElem >= s.peek().h){
				s.push(newel);
			}
			else{
				while(!s.isEmpty() && s.peek().h > curElem){
					HistElement top  = s.pop();
					int area;
					if(s.isEmpty()){
						area = i *top.h;
					}
					else{
						HistElement belowtop = s.peek();
						area = (i - belowtop.index - 1) * top.h;
					}
					if(area  > result){
						result = area;
					}
				}
				s.push(newel);
			}
		}
		int i = s.peek().index +1;
		//System.out.println("index of last element + 1: "+ i + " size of height array: "+ height.length);
		while(!s.isEmpty() ){
			HistElement top  = s.pop();
			int area ;
			if(s.isEmpty()){
				area = i *top.h;
			}
			else{
				HistElement belowtop = s.peek();
				area = (i - belowtop.index - 1) * top.h;
			}
			if(area  > result){
				result = area;
			}
		}
		return result;
	}

}

class HistElement{
	int h;
	int index;

	HistElement(int i, int j){
		h = i;
		index = j;
	}
}
