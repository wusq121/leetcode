package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedList2 {
	public ListNode deleteDuplicates(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode first = head.next, second = temp.next;
		List<Integer> value = new ArrayList<Integer>();
		while(first != null){
			if(first.val == second.val){
				if(value.size() == 0 || first.val != value.get(value.size() - 1))
					value.add(first.val);
				second.next = first.next;
				first = first.next;
			}else{
				first = first.next;
				second = second.next;
			}
		}
		if(value == null || value.size() == 0)
			return temp.next;
		first = temp;
		int i = 0;
		while(first.next != null && i < value.size()){
			if(first.next.val == value.get(i)){
				first.next = first.next.next;
				i++;
			}else{
				first = first.next;
			}
		}
		return temp.next;
	}
}
