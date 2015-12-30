package ProjectFiles;

public class Power_x_n {

	public static void main(String[] args) {
		System.out.println(myPowRec(5,0));
		System.out.println(myPowRec(5,5));
		System.out.println(myPow(5,0));
		System.out.println(myPow(5,5));
		System.out.println(myPow(5,0));
		System.out.println(myPow(5,3));
		System.out.println(myPow(5,1));
		System.out.println(myPow(34.00515,-3));
		System.out.println(myPow(2,-2));
		System.out.println(myPow(2,-3));
		System.out.println(myPowRec(0.00001,2147483647));
	}

	public  static double myPowRec(double x, int n) {
		if(n < 0){
			x = 1/x;
			n = -n;
		}
		if(n  == 0)
			return 1;
		if(n == 1)
			return x;
		if(n %2 == 0){
			double result =  myPowRec(x,n/2) ;
			return result * result;
		}
		else{
			double result =  myPowRec(x,n/2) ;
			return result * result * x;
		}
	}

	public  static double myPow(double x, int n) {
		if(n < 0){
			x = 1/x;
			n = -n;
		}
		if(n  == 0)
			return 1;

		if(n == 1)
			return x;
		
		double[] a = new double[n+1];
		a[0] = 1;
		a[1] = x;
		int  i = 2;
		while(i <= n){
			if(i % 2 == 0)
				a[i] = a[i/2]* a[i/2];
			else
				a[i] = a[i/2]* a[i/2]*x;
			i++;
		}
		return a[n];
	}

	private static double myPowNeg(double x, int n) {
		if(n == 1)
			return x;
		
		double[] a = new double[n+1];
		a[0] = 1;
		a[1] = 1/x;
		int  i = 2;
		while(i <= n){
			if(i % 2 == 0)
				a[i] = a[i/2]* a[i/2];
			else
				a[i] = a[i/2]* a[i/2]*(1/x);
			i++;
		}
		return a[n];
	}


}
