package leetcode;

public class RemoveNthNodeFromEnd {
	//The class ListNode defined at addTwoNums
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode first = temp, second = temp;
		int i = 0;
		while(first.next != null){
			if(i < n){
				i++;
				first = first.next;
			}else {
				second = second.next;
				first = first.next;
			}
		}
		second.next = second.next.next;
		return temp.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
