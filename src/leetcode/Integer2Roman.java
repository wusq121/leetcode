package leetcode;

public class Integer2Roman {
	public String intToRoman(int num){
		String[] T = {"", "M", "MM", "MMM"};
		String[] H = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] Ty = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] O = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		return T[num/1000] + H[(num%1000)/100] + Ty[(num%100)/10] + O[num%10];
	}
}
