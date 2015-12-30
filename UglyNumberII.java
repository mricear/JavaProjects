package ProjectFiles;

public class UglyNumberII {

	public static void main(String[] args) {
		System.out.println(nthUglyNumber(5));
		System.out.println(nthUglyNumber(10));
		System.out.println(nthUglyNumber(11));
		System.out.println(nthUglyNumber(35));
		System.out.println(nthUglyNumber(239));
	}

	private static int nthUglyNumber(int n) {
		boolean[] a =  new boolean[4*n];
		a[1] = true;
		computeNumbers(a,1, a.length);
		int i= 1;
		int nSoFar = 0;
		int result = 1 ;
		while(i < a.length && nSoFar < n){
			System.out.print( i + " : "+a[i] +"   ");
			if(a[i]){
				nSoFar++;
				result  = i;
			}
			i++;
		}
		return result;
	}

	private static void computeNumbers(boolean[] a, int i, int max) {
		if(i < max){
			a[i] = true;
		}
		else{
			return;
		}
		computeNumbers(a, i*2,max);
		computeNumbers(a, i*3, max);
		computeNumbers(a, i*5, max);
	}
}
