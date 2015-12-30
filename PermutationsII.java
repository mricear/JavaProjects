package ProjectFiles;

import java.util.ArrayList;
import java.util.List;

public class PermutationsII {

	public static void main(String[] args) {

	}
	
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		permuteRec(nums,0,list);	
		return list;
	}

	private static void permuteRec(int[] nums, int i, List<List<Integer>> list) {
		if(i == nums.length){
			List<Integer> ar = new ArrayList<Integer>();
			for(int num : nums){
				ar.add(num);
			}
			if(!list.contains(ar))
				list.add(ar);
		}

		for(int j = i; j < nums.length; j++){
			//swap(nums[i], nums[j]);
			int temp;
			if(nums[i] != nums[j]){
				temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}

			permuteRec(nums, i+1 , list);
			if(nums[i] != nums[j]){
				temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
	}

}
