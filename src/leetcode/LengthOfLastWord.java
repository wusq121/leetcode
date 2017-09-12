package leetcode;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s){
		int len = 0;
		s = s.trim();
		if(s == null || s.length() == 0)
			return len;
		for(int i = s.length() - 1; i >= 0; i--){
			if(s.charAt(i) == ' '){
				len = s.length() - 1 -i;
				return len;
			}
		}
		return s.length();
	}
}
