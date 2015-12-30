package ProjectFiles;

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {

	public static void main(String[] args) {
		RandomListNode n1 = new RandomListNode(-11);
		RandomListNode n2 = new RandomListNode(-1);
//		RandomListNode n3 = new RandomListNode(3);
		n1.random = n2;
		n1.next = n2;
//		n2.next = n3;
		n2.random = n1;
//		n3.random = n1;
		RandomListNode r = copyRandomList(n1);
		while(r != null){
			
			System.out.print(r.label +" "+ r.random.label);
			System.out.println();
			r = r.next;
			}
		
	}


	public static RandomListNode copyRandomList(RandomListNode head) {

		if(head == null)
			return head;
		
		Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		RandomListNode cur = head, cur1;
		while(cur != null){

			if(map.containsKey(cur)){
				cur1 = map.get(cur);
			}else{
				cur1 = new RandomListNode(cur.label);
				map.put(cur, cur1);
			}


			if(cur.next != null){
				RandomListNode next = cur.next,next1;
				if(map.containsKey(next)){
					next1 = map.get(next);}
				else{
					next1 = new RandomListNode(next.label);
					map.put(next, next1);
				}
				cur1.next = next1;
			}


			if(cur.random != null){
				RandomListNode random = cur.random, random1;
				if(map.containsKey(random))
					random1 = map.get(random);
				else{
					random1 = new RandomListNode(random.label);
					map.put(random, random1);
				}
				cur1.random = random1;
			}

			cur = cur.next;
		}


		return map.get(head);
	}

}



//  Definition for singly-linked list with a random pointer.
class RandomListNode {
	int label;
	RandomListNode next, random;
	RandomListNode(int x) { this.label = x; }
};
