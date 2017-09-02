package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		if(nums.length < 3) return res;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length-2; i++){
			if(nums[i] > 0) break;
			if(i > 0 && nums[i] == nums[i - 1]) continue;
			int begin = i + 1, end = nums.length - 1;
			while(begin < end) {
				int sum = nums[i] + nums[begin] + nums[end];
				if(sum < 0){
					begin++;
				}else if(sum > 0){
					end--;
				}else {
					ArrayList<Integer> resList = new ArrayList<Integer>(3);
					resList.add(nums[i]);
					resList.add(nums[begin]);
					resList.add(nums[end]);
					res.add(resList);
					do {
						begin++;
					} while (begin < end && nums[begin] == nums[begin - 1]);
					do {
						end--;
					} while (begin < end && nums[end] == nums[end + 1]);
				}
			}
		}
		return res;
	}
}
