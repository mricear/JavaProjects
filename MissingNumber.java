package ProjectFiles;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = {0,1,3,4};
		System.out.println(missingNumber(a));

		int a1[] = {0,1,3,4,5};
		System.out.println(missingNumber(a1));

		int a2[] = {0,1,2,3,4};
		System.out.println(missingNumber(a2));

		int a3[] = {0,1,2,4,5};
		System.out.println(missingNumber(a3));
	}

	public static int missingNumber(int[] nums) {
		int sum = 0;
		int len = nums.length;
		for(int i = 0 ; i < len; i++){
			sum += nums[i];
		}
		return (len*(len+1)/2)- sum;
	}

}
