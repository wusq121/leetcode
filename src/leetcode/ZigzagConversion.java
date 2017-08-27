package leetcode;

public class ZigzagConversion {
	public String convert(String s, int numRows) {
		if(numRows == 1) return s;
		StringBuilder temp[] = new StringBuilder[numRows];
		for(int j = 0; j < numRows; j++)
			temp[j] = new StringBuilder();
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < s.length(); ++i){
			int pos = Math.min((2*numRows - 2) - (i % (2*numRows-2)), (i % (2*numRows - 2)));
			temp[pos].append(s.charAt(i));
		}
		for(int j = 0; j < numRows; ++j){
			res.append(temp[j].toString());
		}
		return res.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigzagConversion z = new ZigzagConversion();
		String s = "PAYPALISHIRING";
		System.out.println(z.convert(s, 3));
	}

}
