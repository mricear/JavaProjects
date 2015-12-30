package ProjectFiles;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean containsDuplicate1(int[] nums) {
		boolean result = false;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < nums.length; i++){
			if(set.contains(nums[i])){
				result = true;
				return result;
			}
			else{
				set.add(nums[i]);
			}
		}
		return result;
	}
	
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0 ; i < nums.length; i++){
			if(!set.add(nums[i])){
				return true;
			}
		}
		return false;
	}

}
