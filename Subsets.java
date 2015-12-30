package ProjectFiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		List<List<Integer>> result = subsets(new int[]{1,2,3});
		for(List<Integer> l : result){
			for(int i: l){
				System.out.print(i);
				}
			System.out.println();
		}
	}
	

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
    	for(int i = 0; i < Math.pow(2, nums.length); i++){
    		List<Integer> l = new ArrayList<Integer> ();
    		for(int j = 0; j < nums.length; j++){
    			if( (i  & (1 << j )) != 0){
    				l.add(nums[nums.length - 1 -j]);
    			}
    		}
    		Collections.sort(l);
    		result.add(l);
    	}
    	return result;
    }
    
    
}
