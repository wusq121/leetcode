package leetcode;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k){
		if(head == null || head.next == null)
			return head;
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode first = temp, second = temp;
		int i = 0;
		while(first.next != null){
			first = first.next;
			i++;
		}
		for(int j = i - k%i; j > 0; j--)
			second = second.next;
		first.next = temp.next;
		temp.next = second.next;
		second.next = null;
		return temp.next;
	}
}
