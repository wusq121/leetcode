package leetcode;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head){
		if(head == null) return head;
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode first = head.next, second = temp.next;
		while(first != null){
			if(first.val == second.val){
				second.next = first.next;
				first = first.next;
			}else{
				first = first.next;
				second = second.next;
			}
		}
		return temp.next;
	}
}
