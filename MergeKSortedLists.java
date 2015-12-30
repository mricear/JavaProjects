package ProjectFiles;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * 
 * @author ma64
 *
 */
public class MergeKSortedLists {

	public static void main(String[] args) {


	}

	public static ListNode mergeKLists(ListNode[] lists) {
		if(lists == null || lists.length == 0){
			return null;
		}

		ListNode result = null;
		PriorityQueue<ListNode> q = new PriorityQueue<>(lists.length, new Comparator<ListNode>(){
			@Override
			public int compare(ListNode n1, ListNode n2){
				if(n1.val < n2.val)
					return -1;
				else if(n1.val == n2.val)
					return 0;
				else
					return 1;
			}
		});

		for(int i = 0; i < lists.length; i++){
			if(lists[i] != null){
				q.add(lists[i]);
			}
		}

		ListNode nodeEnd = null;
		while(q.peek() != null){
			ListNode removedNode = q.poll();

			if(result == null){
				result = removedNode;
				if(removedNode.next != null){
					q.add(removedNode.next);
				}
				nodeEnd = result;
			}
			else{
				nodeEnd.next = removedNode;
				nodeEnd = removedNode;
				if(removedNode.next != null){
					q.add(removedNode.next);
				}
			}
		}
		return result;
	}
}

