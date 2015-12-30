package ProjectFiles;

public class PalindrommeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(123));
		System.out.println(isPalindrome(122));
		System.out.println(isPalindrome(22));
		System.out.println(isPalindrome(0));
		
	}
	public static boolean isPalindrome(int x) {
		if(x < 0 ){
			return false;
		}
		int y = 0;
		int z = x;
		while((z /10 != 0) || ( (z / 10 == 0) && (z % 10 != 0)) ){
			y =  10*y + z%10;
			z /= 10;
		}
		return x == y;
	}
}
