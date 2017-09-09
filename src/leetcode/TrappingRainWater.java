package leetcode;

public class TrappingRainWater {
	public int trap(int[] height){
		int res = 0, hignest = 0;
		for(int i = 0; i < height.length; i++){
			hignest = (height[hignest] > height[i]) ? hignest : i;
		}
		int second = 0;
		for(int i = 0; i < hignest; i++){
			if(second > height[i])
				res += second - height[i];
			else
				second = height[i];
		}
		second = 0;
		for(int i = height.length - 1; i > hignest; i--){
			if(second > height[i])
				res += second - height[i];
			else
				second = height[i];
		}
		return res;
	}
}
