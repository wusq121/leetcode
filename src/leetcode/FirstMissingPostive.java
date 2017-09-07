package leetcode;

public class FirstMissingPostive {
	public int firstMissingPostive(int[] nums){
        int i = 0;
        while(i < nums.length){
            if(nums[i] == i+1 || nums[i] <= 0 || nums[i] > nums.length) i++;
            else if(nums[nums[i]-1] != nums[i]) swap(nums, i, nums[i]-1);
            else i++;
        }
        i = 0;
        while(i < nums.length && nums[i] == i+1) i++;
        return i+1;
    }
    
    private void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
	}
}
