package ProjectFiles;

public class SingleNumber {

	public static void main(String[] args) {
		int[] a = {1,2,3,3,2};
		System.out.println(singleNumber(a));
	}
	public static int singleNumber(int[] nums) {
		if(nums == null || nums.length == 0) return -1;	
		int result = 0;
		for(int i :nums){
			result ^= i;
		}
		return result;
	}
}
