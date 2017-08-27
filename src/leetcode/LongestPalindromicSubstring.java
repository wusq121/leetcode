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
	public String LongestPalindrome(String s){
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		String s = "klvxwqyzugrdoaccdafdfrvxiowkcuedfhoixzipxrkzbvpusslsgfjocvidnpsnkqdfnnzzawzsslwnvvjyoignsfbxkgrokzyusxikxumrxlzzrnbtrixxfioormoyyejashrowjqqzifacecvoruwkuessttlexvdptuvodoavsjaepvrfvbdhumtuvxufzzyowiswokioyjtzzmevttheeyjqcldllxvjraeyflthntsmipaoyjixygbtbvbnnrmlwwkeikhnnmlfspjgmcxwbjyhomfjdcnogqjviggklplpznfwjydkxzjkoskvqvnxfzdrsmooyciwulvtlmvnjbbmffureoilszlonibbcwfsjzguxqrjwypwrskhrttvnqoqisdfuifqnabzbvyzgbxfvmcomneykfmycevnrcsyqclamfxskmsxreptpxqxqidvjbuduktnwwoztvkuebfdigmjqfuolqzvjincchlmbrxpqgguwuyhrdtwqkdlqidlxzqktgzktihvlwsbysjeykiwokyqaskjjngovbagspyspeghutyoeahhgynzsyaszlirmlekpboywqdliumihwnsnwjc";
		System.out.println("longest:" + l.LongestPalindrome(s));
	}

}
