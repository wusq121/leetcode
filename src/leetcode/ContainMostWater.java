package leetcode;

public class ContainMostWater {
	public int maxArea(int[] height) {
		int i = 0, j = height.length - 1;
		int area = 0;
		while(i < j) {
			int temp;
			if(height[i] < height[j]){
				temp = height[i] * (j - i);
				i++;
			}else{
				temp = height[j] * (j - i);
				j--;
			}
			area = (area > temp) ? area : temp;
		}
		return area;
	}
}
