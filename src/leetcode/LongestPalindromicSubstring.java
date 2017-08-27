package leetcode;

public class LongestPalindromicSubstring {
	private boolean isPalindromic(String s) {
		int n = s.length();
		if( n == 1) return true;
		for(int i = 0; i <= n - i - 1; i++){
			if(s.charAt(i) != s.charAt(n-i-1))
				return false;
		}
		return true;
	}
	public String LongestPalindrome1(String s){
		int l = 0;
		String temp, res = null;
		for(int i = 0; i < s.length(); i++){
			for(int j = i; j <= s.length(); j++){
				temp = s.substring(i, j);
				if (isPalindromic(temp)) {
					if ((j - i + 1) > l){
						l = j - i + 1;
						res = temp.substring(0);
					}
				}
			}
		}
		return res;
	}
	private int expand(String s, int left, int right) {
		int L = left, R = right;
		while((L >= 0) && (R < s.length()) && (s.charAt(L) == s.charAt(R))){
			L--;
			R++;
		}
		return R - L - 1;
	}
	
	public String LongestPalindrome2(String s){
		int start = 0, end = 0; 
		for(int i = 0; i < s.length(); i++){
			int len1 = expand(s, i, i);
			int len2 = expand(s, i, i + 1);
			int len = Math.max(len1, len2);
			if(len > (end - start)){
				start = i - (len - 1)/2;
				end = i + len/2;
			}
		}
		return s.substring(start, end + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		String s = "klvxwqyzugrdoaccdafdfrvxiowkcuedfhoixzipxrkzbvpusslsgfjocvidnpsnkqdfnnzzawzsslwnvvjyoignsfbxkgrokzyusxikxumrxlzzrnbtrixxfioormoyyejashrowjqqzifacecvoruwkuessttlexvdptuvodoavsjaepvrfvbdhumtuvxufzzyowiswokioyjtzzmevttheeyjqcldllxvjraeyflthntsmipaoyjixygbtbvbnnrmlwwkeikhnnmlfspjgmcxwbjyhomfjdcnogqjviggklplpznfwjydkxzjkoskvqvnxfzdrsmooyciwulvtlmvnjbbmffureoilszlonibbcwfsjzguxqrjwypwrskhrttvnqoqisdfuifqnabzbvyzgbxfvmcomneykfmycevnrcsyqclamfxskmsxreptpxqxqidvjbuduktnwwoztvkuebfdigmjqfuolqzvjincchlmbrxpqgguwuyhrdtwqkdlqidlxzqktgzktihvlwsbysjeykiwokyqaskjjngovbagspyspeghutyoeahhgynzsyaszlirmlekpboywqdliumihwnsnwjc";
		System.out.println("longest:" + l.LongestPalindrome1(s));
		System.out.println("longest fast:" + l.LongestPalindrome2(s));
	}
}
