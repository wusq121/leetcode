package leetcode;

public class SearchForARange {
	public int[] searchRange(int[] nums, int target){
		int[] res = new int[]{-1, -1};
		if(nums == null || nums.length == 0)
			return res;
		int left = 0, right =nums.length - 1;
		while(left < right){
			int mid = (left + right) / 2;
			if(nums[mid] < target) 
				left = mid + 1;
			else
				right = mid;
		}
		if(nums[right] != target)
			return res;
		res[0] = right;
		right = nums.length;
		while(left < right){
			int mid = (left + right) / 2;
			if(nums[mid] <= target)
				left = mid + 1;
			else
				right = mid;
		}
		res[1] = left - 1;
		return res;
	}
}
