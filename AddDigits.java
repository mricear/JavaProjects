package ProjectFiles;

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(32));
		System.out.println(addDigits(38));
		System.out.println(addDigits(39));
		System.out.println(addDigits(88));
		System.out.println(addDigits(99));
		System.out.println(addDigits(0));
		System.out.println(addDigits(801));
		
		
	}

	public static int addDigits(int num) {
		if(num == 0 ){
			return 0;
		}
		while(num /10 != 0){
			int sum = num;
			int curSum = 0;
			while(sum /10 != 0 || sum %10 != 0){
				curSum += ( sum % 10);
				sum /= 10;
			}
			num = curSum;
		}
		return num;
	}

}
