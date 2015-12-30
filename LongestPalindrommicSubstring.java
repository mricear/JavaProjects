package ProjectFiles;

public class LongestPalindrommicSubstring {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("sabad"));
		System.out.println(longestPalindrome("dabad"));
		System.out.println(longestPalindrome("s"));
		System.out.println(longestPalindrome("sabf"));
		System.out.println(longestPalindrome("sabadffffffksls"));
		System.out.println(longestPalindrome("ssffe"));
		System.out.println(longestPalindrome("sssfffe"));
		System.out.println(longestPalindrome("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

	}

	public static String longestPalindrome(String s) {
		boolean[][] a = new boolean[s.length()][s.length()];
		String result = s.charAt(0) +"";
		for(int i = 0; i <  s.length(); i++){
			a[i][i] = true;
		}

		boolean foundAResult = false;
		for(int i = 1; i <  s.length(); i++){
			
			if(s.charAt(i) == s.charAt(i -1)){
				a[i-1][i] = true;
				if(!foundAResult){
					result = s.substring(i-1,i+1 );
					foundAResult = true;
				}
			}
		}


		for(int len = 3; len <= s.length(); len++){
			foundAResult = false;
			for(int i = 0; i + len -1 < s.length(); i++)
				if(s.charAt(i) == s.charAt(i + len -1) && a[i+1][i+len -2]){
					a[i][i+len -1] = true;
					if(!foundAResult){
						result = s.substring(i, i + len);
						foundAResult = true;
					}
				}
		}
		return result;
	}

}
