package ProjectFiles;

public class PalindrommeLinkedList {

	public static void main(String[] args) {
		ListNode h = new ListNode(1);
		h.next = new ListNode(1);
		h.next.next = new ListNode(1);
		ListNode t = h.next.next;
		t.next = new ListNode(2);
		t.next.next = new ListNode(1);
		t.next.next.next = null;
		ListNode root = h;
//		while(root != null){
//			System.out.println(root.val);
//			root= root.next;
//			}
		System.out.println(isPalindrome(h.next));
		
		
		
	}

	public static boolean isPalindrome(ListNode head) {
		if(head == null){
			return false;
		}
		PalindrommeResult result = new PalindrommeResult(true, false);
		isPalindromeRec(head, head,result );
		return result.r;
	}

	private static ListNode isPalindromeRec(ListNode cur, ListNode head, PalindrommeResult r) {
		if(r.done)
			return null;
		if(cur.next == null){
			if(head.val != cur.val){
				r.r = false;
			}
			return head.next;
		}
		else{
			ListNode comparableNode = isPalindromeRec(cur.next, head, r);
			if(comparableNode == null){
				return null;
			}
			if(cur == comparableNode || comparableNode.next == cur){
				r.done = true;
			}
			if(r.r ==  false){
				return comparableNode.next;
			}
			if(comparableNode.val != cur.val){
				r.r = false;
			}
			else{
				return comparableNode.next;
			}
		}
		return null;
		
	}
}


class PalindrommeResult{
	boolean r;
	boolean done;
	
	PalindrommeResult(boolean val, boolean d) {
		d = done;
		r= val;
	}
}