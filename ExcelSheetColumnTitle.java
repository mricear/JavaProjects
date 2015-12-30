package ProjectFiles;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		System.out.println(convertToTitle(27));	
		System.out.println(convertToTitle(26));	
	}

	public static String convertToTitle(int n) {
		
		String result ="";
		while(n > 0){
			result = (char)('A' +(n- 1)%26) + result;
			n = (n-1)/ 26;
		}
		return result;
	}
}
