package ProjectFiles;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int[] a1 = {1,3,6,2,3,4};
		int target = 12;
		System.out.println(minSubArrayLen(target, a1));
		int[] a2  = {2,3,1,2,4,3};
		target = 7;
		System.out.println(minSubArrayLen(target, a2));
	}


	public static int minSubArrayLen(int s, int[] nums){
		if(nums.length == 0){
			return 0;
		}
		int length = 0;
		int start = 0;
		int sum = nums[0];

		for(int i = 0 ; i < nums.length; ){

			if(sum <  s){
				i++;
				if(i < nums.length)
					sum += nums[i];
			}
			else{
				if(length == 0 ){
					length = (i - start + 1);
				}
				else{
					length = Integer.min(length, i - start +1);
				}
				sum -= nums[start];
				start++;
			}
		}
		return length;
	}

}
