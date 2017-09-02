package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumCloset(int[] nums, int target) {
		int res = nums[0] + nums[1] + nums[2] - target;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length -2; i++) {
			int begin = i + 1, end = nums.length-1;
			while(begin < end) {
				int newRes = nums[i] + nums[begin] + nums[end] - target;
				if(newRes > 0){
					end--;
				}else{
					begin++;
				}
				res = (Math.abs(res) < Math.abs(newRes)) ? res : newRes;
			}
		}
		return res+target;
	}
}
