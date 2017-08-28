package leetcode;

public class Atoi {
	public int myAtoi(String str){
		str = str.trim();
		if(str.length() == 0 || str == null)
			return 0;
		int strat = 0, sign = 1;
		long sum = 0;
		if(str.charAt(strat) == '+'){
			strat++;
		}else if (str.charAt(strat) == '-') {
			sign = -1;
			strat++;
		}
		for(int i = strat; i < str.length(); i++){
			if(!Character.isDigit(str.charAt(i)))
				break;
			sum = sum * 10 + (str.charAt(i) - '0');
			if(sum > Integer.MAX_VALUE && sign == 1)
				return Integer.MAX_VALUE;
			else if (((0 - sum) < Integer.MIN_VALUE) && sign == -1) {
				return Integer.MIN_VALUE;
		}
		sum = sum * sign;
		}
		return (int)sum;
	}
}
