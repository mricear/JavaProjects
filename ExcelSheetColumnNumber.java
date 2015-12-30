package ProjectFiles;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("AA"));
	}

    public static int titleToNumber1(String s) {
        int result = 0;
    	for(int i = s.length() - 1; i >= 0 ; i--){
    		int num = s.charAt(i) - 'A' +1;
    		int pow = (int) Math.pow(26, s.length() -1 - i);
    		result += num*pow;
    	}
    	return result;
    }
    
    public static int titleToNumber(String s) {
        int result = 0;
    	for(int i = 0; i < s.length(); i++){
    		result = result * 26 + s.charAt(i) - 'A' +1;
    	}
    	return result;
    }
}
