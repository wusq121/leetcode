package leetcode;

public class ReverseInt {
	public int reverse(int x) {
		long res = 0;
		if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
			return 0;
		int t = Math.abs(x);
		while(t != 0){
			res = res * 10 + t % 10;
			t /= 10;
		}
		res = (x > 0) ? res : -res;
		if((res > Integer.MAX_VALUE)||(res < Integer.MIN_VALUE))
			return 0;
		return (int)res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInt r = new ReverseInt();
		System.out.println(r.reverse(173741824));
	}

}
