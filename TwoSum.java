package ProjectFiles;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		//int[] result = twoSum(new int[]{7,2,11,15},22);
		
		//System.out.println(result[0] +"  "+ result[1]);
		long x = 12;
		int k = (int) x;
		System.out.println(k);
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(target - nums[i])){
				return new int[]{map.get(target - nums[i]), i};
			}
			else{
				map.put(nums[i]+1, i+1);
			}
		}
		return new int[]{-1,-1};
	}
}
