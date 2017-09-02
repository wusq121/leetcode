package leetcode;

public class MergeKLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists == null || lists.length == 0) return null;
		return mergeLists(lists, 0, lists.length - 1);
	}
	
	private ListNode mergeLists(ListNode[] lists, int begin, int end){
		if (begin == end) return lists[begin];
		if (begin == end - 1) return merge2Lists(lists[begin], lists[end]);
		int mid = (begin + end)/2;
		ListNode left = mergeLists(lists, begin, mid);
		ListNode right = mergeLists(lists, mid+1, end);
		return merge2Lists(left, right);
	}
	private ListNode merge2Lists(ListNode l1, ListNode l2){
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
