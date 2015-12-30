package ProjectFiles;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		System.out.println(findDuplicate1(new int[]{1,2,2,2,2}));
		System.out.println(findDuplicate(new int[]{2,2,2,2,2}));
	}

	
	public static int findDuplicate1(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int actual_sum = (nums.length-1)* nums.length / 2;
        return sum - actual_sum;
    }
	
	public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1 ; i <  nums.length; i++){
            if(nums[i] == nums[i-1]){
            	return nums[i];
            }
        }
        return -1;
    }
}
