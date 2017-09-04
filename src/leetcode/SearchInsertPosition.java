package leetcode;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target){
		int left = 0, right = nums.length - 1, mid = 0;
        if(nums == null || nums.length == 0 || nums[0] > target)
            return 0;
        if(nums[right] < target)
            return right + 1;
		while(left <= right){
			mid = (left + right) / 2;
			if(nums[mid] == target)
				return mid;
			else if(nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return left;
	}
}