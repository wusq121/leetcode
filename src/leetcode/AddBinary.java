package leetcode;

public class AddBinary {
	public String addBinary(String a, String b){
		if(a.length() < b.length())
			return addBinary(b, a);
		int[] res = new int[a.length() + 1];
		int carry = 0;
		for(int i = a.length() - 1, j = b.length() - 1; i >= 0; i--, j--){
			if(j >= 0){
				res[i + 1] = (a.charAt(i) - '0') + (b.charAt(j) - '0') + carry;
				carry = res[i + 1] / 2;
				res[i + 1] %= 2;
			}else{
				res[i + 1] = (a.charAt(i) - '0') + carry;
				carry = res[i + 1] / 2;
				res[i + 1] %= 2; 
			}
		}
		res[0] = carry;
		StringBuilder sb = new StringBuilder();
		if(res[0] == 1){
			sb.append(res[0]);
		}
		for(int i = 1; i < res.length; i++){
			sb.append(res[i]);
		}
		return sb.toString();
	}
	public static void main(String...args) {
		AddBinary ab = new AddBinary();
		System.out.println(ab.addBinary("1", "0"));
	}
}
