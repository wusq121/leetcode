package leetcode;

public class Divide {
	public int divide(int dividend, int divisor) {
		long a = Math.abs((long)dividend);
		long b = Math.abs((long)divisor);
		long res = 0;
		while(a >= b){
			long c = b;
			int i = 0;
			while(a >= c){
				a = a-c;
				res += (1<<i);
				i++;
				c = c << 1;
			}
		}
		if((dividend > 0 && divisor < 0)||(dividend < 0 && divisor > 0))
			res = -res;
		if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
			return Integer.MAX_VALUE;
		return (int)res;
	}
}
