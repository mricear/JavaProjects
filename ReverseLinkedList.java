package ProjectFiles;

public class ReverseLinkedList {

	public static void main(String[] args) {


	}
	public ListNode reverseList(ListNode head) {
		
		if(head == null || head.next == null)
			return head;
		
		ListNode  s = head, f= null, t = head.next;
		
		while(s != null){
			s.next = f;
			f = s;
			s = t;
			if(t != null)
				t = t.next;
			else{
				return f;
			}
		}
		return f;
//		if(head == null	){
//			return null;
//		}
//
//		if(head.next == null){
//			return head;
//		}
//		s = head; f= s.next; t = null;
//		while(s!=null){
//			s.next = t;
//			t = s;
//			s = f;
//			if(f != null){
//				f = f.next;
//			}
//		}
//		return t;
	}
	
	public ListNode reverseListRec(ListNode head){
		return reverse(head, null);
	}
	private ListNode reverse(ListNode head, ListNode prev) {
		if(head == null){
		return prev;
		}
		ListNode next = head.next;
		head.next = prev;
		return reverse(head, next);
	}
}
