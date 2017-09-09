package leetcode;

public class Mutiply {
	public String mutiply(String num1, String num2){
		int[] num = new int[num1.length() + num2.length() - 1];
		for(int i = num1.length() - 1; i >= 0; i--)
			for(int j = num2.length() - 1; j >= 0; j--)
				num[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
		int carry = 0;
		for(int i = num.length - 1; i >= 0; i--){
			num[i] += carry;
			carry = num[i] / 10;
			num[i] = num[i] % 10;
		}
		StringBuilder s = new StringBuilder();
		boolean firstNonZero = false;
		for(int i = 0; i < num.length; i++){
			if(!firstNonZero && num[i] == 0){
				continue;
			}else{
				s.append(num[i]);
				firstNonZero = true;
			}
		}
		if(s.length() == 0) s.append(0);
		return s.toString();
	}
}
