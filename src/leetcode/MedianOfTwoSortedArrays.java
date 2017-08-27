package leetcode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
		if((total % 2) == 1){
			return findKth(nums1, nums2, total / 2 + 1);
		}
		else{
			return (findKth(nums1, nums2, total/2) + findKth(nums1, nums2, total/2 + 1))/2.0;
		}	
    }
    private int findKth(int[] nums1, int[] nums2, int k) {
		if(nums1.length == 0)
			return nums2[k-1];
		if(nums1.length > nums2.length)
			return findKth(nums2, nums1, k);
		if (k == 1)
			return Math.min(nums1[0], nums2[0]);
		int p1 = Math.min(nums1.length, k/2);
		int p2 = k - p1;
		if(nums1[p1 - 1] < nums2[p2 -1]){
			int[] a = new int[nums1.length - p1];
			System.arraycopy(nums1, p1, a, 0, a.length);
			return findKth(a, nums2, k - p1);
		}
		else if(nums1[p1 - 1] > nums2[p2 - 1]){
			int[] b = new int[nums2.length - p2];
			System.arraycopy(nums2, p2, b, 0, b.length);
			return findKth(nums1, b, k - p2);
		}
		else 
			return nums1[p1 - 1];
	}

}
