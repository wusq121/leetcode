package leetcode;

public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
		if(nums.length == 0 || nums == null) return -1;
		int left = 0, right = nums.length - 1;
		while(left <= right){
			int mid = (left + right)/2;
			if(nums[mid] == target) 
				return mid;
			else if(nums[mid] < nums[right]){
				if(nums[mid] < target && nums[right] >= target)
					left = mid + 1;
				else
					right = mid - 1;
			}else {
				if(nums[left] <= target && nums[mid] > target)
					right = mid - 1;
				else
					left = mid + 1;
			}
		}
		return -1;
	}
}
