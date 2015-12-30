package ProjectFiles;

public class RorateRight {

	public static void main(String[] args) {
		ListNode h = new ListNode(1);
		h.next = new ListNode(2);
		h.next.next = new ListNode(3);
//		ListNode t = h.next.next;
//		t.next = new ListNode(2);
//		t.next.next = new ListNode(1);
//		t.next.next.next = null;
		ListNode root = h;
		root = rotateRight(root, 6);
		while(root != null){
			System.out.println(root.val);
			root = root.next;
		}
	}

	private  static ListNode rotateRight(ListNode head, int k) {
		if(k == 0 || head == null || head.next == null){
			return head;
		}
		ListNode headNode = head;
		ListNode tailNode ;
		int length = 1;
		int i = 1;
		boolean isLengthShoterThanK = false;
		while( i <= k){
			if(headNode.next == null){
				isLengthShoterThanK = true;
				break;
			}
			headNode  = headNode.next;
			length++;
			i++;
		}

		if(isLengthShoterThanK){
			return rotateRight(head , k % length );
		}
		
		tailNode = head;
		while(headNode.next != null){
			tailNode = tailNode.next;
			headNode = headNode.next;
		}
		ListNode start = tailNode.next;
		tailNode.next = null;
		
		headNode.next = head;
		head = start;
		return head;
	}

}
