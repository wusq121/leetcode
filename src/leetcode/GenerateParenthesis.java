package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	public List<String> generateParenthesis(int n){
		List<String> res = new ArrayList<String>();
		generateOneByOne("", n, n, res);
		return res;
	}
	private void generateOneByOne(String str, int left, int right, List<String> list){
		if(left > right) return ;
		if(left > 0)
			generateOneByOne(str+"(", left - 1, right, list);
		if(right > 0)
			generateOneByOne(str+")", left, right - 1, list);
		if(left == 0 && right == 0)
			list.add(str);
	}
}
