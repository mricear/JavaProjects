package ProjectFiles;

public class MaximumSubarray {

	public static void main(String[] args) {
		System.out.println(m(new int[]{-2,-3,-1} ,3));
		System.out.println(maxSubArray(new int[]{1,3,-5,10} ));
		System.out.println(maxSubArray(new int[]{-1,89,-4} ));
		System.out.println(maxSubArray(new int[]{1,3,4} ));
		System.out.println(maxSubArray(new int[]{-1,3,4} ));
		System.out.println(maxSubArray(new int[]{-2,-3,-1} ));
		System.out.println(maxSubArray(new int[]{-1,-3,0,-9,7} ));
		
	}

	// This code covers all the cases including the all negative numbers.
	public static int maxSubArray(int[] nums) {
		if(nums.length == 0){
			return 0;
		}
		if(nums.length == 1)
			return nums[0];

		int maxSoFar = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < nums.length ; i++){
			sum += nums[i];
			if(sum > maxSoFar){
				maxSoFar = sum;
			}
			if(sum < 0){
				sum = 0;
			}
			
		}
		return maxSoFar;
	}
	
	//This code doesn't cover the all negative numbers case.
	public static int m(int[] a, int size){
	    int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
	    
	    for (int i = 0; i < size; i++)
	    {
	        max_ending_here = max_ending_here + a[i];
	        
	        if (max_so_far < max_ending_here)
	            max_so_far = max_ending_here;
	        
	        if (max_ending_here < 0)
	            max_ending_here = 0;
	    }
	    return max_so_far;
	}
	

}
