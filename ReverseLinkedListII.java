package ProjectFiles;

public class ReverseLinkedListII {

	public static void main(String[] args) {
		
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		int k = 1, N = n -m +1;
		if(head == null)
			return head;
		ListNode t = head;
		
		while(t != null && k <= m){
			t = t.next;k++;
		}
		k = 0;
		
		
			
	}
}
