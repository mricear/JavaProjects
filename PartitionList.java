package ProjectFiles;

public class PartitionList {

	public static void main(String[] args) {
		
	}

    public static ListNode partition(ListNode head, int x) {
    	if(head == null || head.next == null)
    		return head;
        ListNode dummy =  new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy, t = dummy;
        
        while(t.next != null && t.next.val < x ){
        	t = t.next;
        	cur = t;
        }
        while(cur.next != null){
        	if(cur.next.val < x ){
        		ListNode tnext = t.next;
        		ListNode cNextnext = cur.next.next;
        		t.next = cur.next;
        		cur.next.next = tnext;
        		cur.next = cNextnext;
        		t = t.next;	
        	}
        	else{
        		cur = cur.next;
        	}
        		
        }
        return dummy.next;
    }
}
