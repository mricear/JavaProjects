package ProjectFiles;

public class MultiplyStrings {

	public static void main(String[] args) {
//		System.out.println(add("13","112").equals("125"));
//		System.out.println(add("13","10").equals("23"));
//		System.out.println(add("13","0").equals("13"));
//		System.out.println(add("","").equals(""));
//		System.out.println(add("13","90"));
//		
//		System.out.println(multipleCharWithString('3', "1901"));
		System.out.println(multiply(  "1222", "0"));
	}

	public static String multiply(String num1, String num2) {
		
		if(num1.equals("0") || num2.equals("0"))
			return "0";
		String result = "";
		int i = num1.length() -1;
		String prevCalculatedSum = "";
		for(; i >= 0; i--){
			String multiplyResult = multipleCharWithString(num1.charAt(i), num2);
			int numsOfZerosToAppend =  num1.length()-1 - i;
			while(numsOfZerosToAppend > 0 ){
				multiplyResult = multiplyResult + "0";
				numsOfZerosToAppend--;
			}
			prevCalculatedSum = add(prevCalculatedSum, multiplyResult);
		}
		return prevCalculatedSum;
	}

	public static String multipleCharWithString(char c, String s){
		if(c == '0'){
			return "0";
		}
		String result = "";
		int carry = 0;
		int i = s.length() -1;
		int b = c - '0';
		for( ; i >=0; i-- ){
			int a = s.charAt(i) - '0';
			int sum = a * b + carry;
			carry = sum/10;
			result = sum%10 + result;
		}
		if(carry > 0)
			return carry+result;

		return result;
	}

	public static String add(String s1, String s2){
		String result ="";
		int carry = 0;
		int i = s1.length() - 1, j = s2.length() - 1;
		for( ; i >=0 && j >=0; i--,j-- ){
			int a = s1.charAt(i) - '0';
			int b = s2.charAt(j) - '0';
			int sum = a+b + carry;
			carry = sum/10;
			result = sum%10 + result;
		}

		if(i < 0){
			while(j >= 0){
				int  b = s2.charAt(j) - '0';
				int sum = b+carry;
				carry = sum/10;
				result = sum%10 + result;
				j--;
			} 
		}
		if(j < 0 ){
			while(i >= 0){
				int a = s1.charAt(i) - '0';
				int sum = a + carry;
				carry = sum/10;
				result = sum%10 + result;
				i--;
			}
		}
		if(carry > 0)
			return carry+result;

		return result;
	}
}
