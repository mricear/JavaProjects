package ProjectFiles;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		System.out.println(maxProduct(new int[]{-2,7,8}));
	}

	public static int maxProduct(int[] nums) {
		if(nums == null)
			return 0;
		
		int result = nums[0], productSoFar = result;
		boolean isOddNegatives= false;
		int second = Integer.MIN_VALUE;
		if(result < 0){
			isOddNegatives = true;
			second = result;
		}

		
		for(int i = 1; i < nums.length ; i++){
			int cur = nums[i];
			if(cur == 0){
				if(productSoFar < 0)
					result = 0;
				if(productSoFar > result )
					result = productSoFar;
				if(second > result )
					result = second;
				
			}
			else if(cur < 0 ){
				if(!isOddNegatives){
					if(productSoFar > result )
						result = productSoFar;
					isOddNegatives = true;
					second = 1;
				}
				else{
					isOddNegatives = false;
					if(second > result )
						result = second;
					second = -1;
				}
			}
			productSoFar *= cur;
			if(isOddNegatives && cur >0){
				second *= cur;
			}
		}
		if(productSoFar > result)
			result = productSoFar;

		if(second > result && second > 0 )
			result = second;

		return result;
	}


}
