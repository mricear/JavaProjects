package ProjectFiles;

public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {

	}

	private static ListNode deleteDuplicates(ListNode head) {
		ListNode o = head;
		if(head == null)
			return head;
		if(head.next == null)
			return head;
		ListNode temp = head;
		ListNode prev = null ;
		while(temp.next != null){
			if(temp.next.val == temp.val){
				while(temp.next != null && temp.next.val == temp.val){
					temp.next = temp.next.next;
				}
				if(temp.next != null){
					if(prev == null){
						head = temp.next;

					}else{
						prev.next = temp.next;
					}
					temp = temp.next;
				}
				else{
					if(prev == null){
						return null;
					}
					prev.next = null;
				}
			}
			else{
				prev = temp;
				temp = temp.next;
			}

		}
		if(temp.val == o.val){
			return null;
		}
		return head;
	}

	private static ListNode deleteDuplicates1(ListNode head) {
		if(head == null)
			return head;
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode prev = dummy;
		ListNode t = head;
		while(t!= null && t.next != null){
			if(t.next.val == t.val){
				while(t.next != null && t.next.val == t.val){
					t.next = t.next.next;
				}
				prev.next = t.next;
				t = t.next;
			}
			else{
				prev = t;
				t = t.next;
			}
		}
		return dummy.next;
	}
}
