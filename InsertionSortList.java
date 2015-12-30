package ProjectFiles;

public class InsertionSortList {

	public static void main(String[] args) {

	}

	public static ListNode insertionSortList(ListNode head) {
		if(head == null)
			return head;
		
		ListNode result = head;

		head = head.next;

		while(head != null){
			int val = head.val;
			ListNode cur = result;

			while(cur.next != head && cur.next != null ){
				if(cur.next.val  > val){
					break;
				}
				cur = cur.next;
			}
			if(cur.next != head ){
				ListNode next = cur.next;
				cur.next = head ;
				head.next = next;
			}
			head = head.next;
		}
		return head;
	}

}
