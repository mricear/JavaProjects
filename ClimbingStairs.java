package ProjectFiles;

public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairsRec(1));
		System.out.println(climbStairsRec(2));
		System.out.println(climbStairsRec(44));
		System.out.println(climbStairs(1));
		System.out.println(climbStairs(2));
		System.out.println(climbStairs(44));
		

	}
	public static int climbStairsRec(int n) {
		if(n < 0){
			return 0;
		}
		if(n == 0){
			return 1;
		}
		return climbStairsRec(n-1) + climbStairsRec(n-2);
	}
	
	public static int climbStairs(int n) {
		int [] a = new int[n+1];
		if(n <= 0)
			return 0;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		a[0] = 0;a[1] = 1; a[2] = 2;
		for(int i = 3; i < a.length; i++){
			a[i] = a[i-1] + a[i-2]; 
		}
		return a[n];
	}

}
