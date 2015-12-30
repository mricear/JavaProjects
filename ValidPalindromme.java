package ProjectFiles;

public class ValidPalindromme {

	public static void main(String[] a){
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome("1a1"));
		System.out.println(isPalindrome("0k.;r0.k;"));
	}

	public static boolean isPalindrome(String s) {
		String n = s.toLowerCase();

		int i = 0, j = n.length() -1;

		while(i < j){
			char b = n.charAt(i);
			char e = n.charAt(j);
			if(Character.isLetterOrDigit(b)){
				if(Character.isLetterOrDigit(e)){
					System.out.println(b+" " + e);
					if(b != e){
						return false;
					}
					else{
						i++;
						j--;
					}
				}
				else{
					j--;
				}
			}
			else{
				i++;
			}
		}
		return true;
	}
}
