package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
	private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", 
			"tuv", "wxyz"};
	public List<String> letterCombinations(String digits) {
		List<String> ret = new LinkedList<String>();
		if(digits.length() == 0) return ret;
		combination("", 0, digits, ret);
		return ret;
	}
	private void combination(String p, int offset, String digits, List<String> ret) {
		// TODO Auto-generated method stub
		if(offset >= digits.length()){
			ret.add(p);
		}else{
			String letters = KEYS[digits.charAt(offset) - '0'];
			for(int i = 0; i < letters.length(); i++){
				combination(p + letters.charAt(i), offset + 1, digits, ret);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
