package leetcode;

public class LongestCommomPrefix {
	public String LongestCommonPrefix(String[] strs){
		StringBuilder prefix = new StringBuilder();
		int i = 0;
		while(isCommom(strs, i)){
			prefix.append(strs[0].charAt(i));
			i++;
		}
		return prefix.toString();
	}
	
	private boolean isCommom(String[] strs, int index) {
		int len = strs[0].length();
		for(int i = 0; i < strs.length; i++)
			len = (len > strs[i].length()) ? strs[i].length() : len;
		if(index >= len)
			return false;
		for(int i = 0; i < strs.length; i++){
			if(strs[i].charAt(index) != strs[0].charAt(index))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
