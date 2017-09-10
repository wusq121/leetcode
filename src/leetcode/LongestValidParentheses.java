package leetcode;

public class LongestValidParentheses {
	public int longestValidParentheses(String s){
		int left = 0, right = 0, maxlen = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '(')
				left++;
			else
				right++;
			if(left == right)
				maxlen = (maxlen > 2*right) ? maxlen : 2 * right;
			else if(left < right)
				left = right = 0;
		}
		left = right = 0;
		for(int i = s.length() - 1; i >= 0; i--){
			if(s.charAt(i) == '(')
				left++;
			else
				right++;
			if(left == right)
				maxlen = (maxlen > 2*right) ? maxlen : 2 * right;
			else if(left < right)
				left = right = 0;			
		}
		return maxlen;
	}
}
