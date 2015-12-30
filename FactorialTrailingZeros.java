package ProjectFiles;

public class FactorialTrailingZeros {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(95));
	}
	
    public static int trailingZeroes(int n) {
    	int c5 = 0, c2 = 0;
    	for(int i = 2; i <= n; i++){
    		p *= i;
    	}
    	int result = 0;
    	while(p != 0 && p % 10 == 0){
    		result++;
    		p = p /10;
    	}
        return result;
    }

}
