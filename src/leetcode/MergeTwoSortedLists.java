package leetcode;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode head = new ListNode(0);
		ListNode curr = head;
		ListNode pl1 = l1, pl2 = l2;
		while(pl1 != null && pl2 != null){
			ListNode temp;
			if(pl1.val > pl2.val){
				temp = new ListNode(pl2.val);
				pl2 = pl2.next;
			}else {
				temp = new ListNode(pl1.val);
				pl1 = pl1.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
		curr.next = (pl1 == null) ? pl2 : pl1;
		return head.next;
	}

}
