package ProjectFiles;

public class RemoveLinkedListElements {

	public static void main(String[] args) {

	}

	public ListNode removeElements(ListNode head, int val) {

		while( head != null && head.val == val){
			head = head.next;
		}
		
		if(head == null)
			return head;
		
		ListNode cur = head;
		
		while(cur.next != null){
			if(cur.next.val == val){
				cur.next = cur.next.next;
			}
			else{
				cur = cur.next;
			}
		}
		return head;
	}
}