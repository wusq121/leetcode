package leetcode;

public class MaximumSubarray {
	public int maxSubarray(int[] nums){
		if(nums == null || nums.length == 0)
			return 0;
		int max = nums[0], currMax = nums[0];
		for(int i = 1; i < nums.length; i++){
			currMax = (currMax + nums[i] > nums[i]) ? currMax + nums[i] : nums[i];
			max = (max > currMax) ? max : currMax;
		}
		return max;
	}
}
