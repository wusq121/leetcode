package leetcode;

public class ReverseNodesKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		if (head == null ||head.next == null|| k <= 1) return head;
		ListNode temp = new ListNode(0);
		temp.next = head;
		
		ListNode pre = temp, cross = head;
		int count = 0;
		while(cross != null) {
			count++;
			if(count % k == 0) {
				pre = reverse(pre, cross.next);
				cross = pre.next;
			}else{
				cross = cross.next;
			}
		}
		return temp.next;
	}
	private ListNode reverse(ListNode pre, ListNode next) {
		ListNode last = pre.next;
		ListNode cur = last.next;
		while(cur != next){
			last.next = cur.next;
			cur.next = pre.next;
			pre.next = cur;
			cur = last.next;
		}
		return last;
	}
}
