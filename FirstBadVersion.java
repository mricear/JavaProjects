package ProjectFiles;

public class FirstBadVersion {

	public static void main(String[] args) {
		System.out.println(firstBadVersion(7));
	}


	public static int firstBadVersion(int n) {
		if(n == 0) return 0;

		return binarySearchBadVer(n);
	}
	
	private static int binarySearchBadVer(int n) {
		int start = 1;
		int end = n;
		int mid = ( (end - start+1)  /2 )+ 1;
		while(start <= end){
			if(isBadVersion(mid)){
				if(mid -1  == 0){
					return 1;
				}
				if(!isBadVersion(mid -1)){
					return mid;
				}
				end = mid -1;
			}
			else{
				start = mid +1;
			}
			mid  = start +( (end - start+1)  /2 );
		}
		return 0;
	}
	
	//DUMMY FUNCTION
	private static boolean isBadVersion(int version){
		boolean[] a = {false, false, false, false,false, false,false};
		return a[version-1];
	}
}
