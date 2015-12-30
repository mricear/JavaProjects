package ProjectFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class _3Sum {

	public static void main(String[] args) {

		int[] n1 = {2,-3,5,-9,7,3,0};

		for(List<Integer> list : threeSum1(n1)){
			//System.out.println(list);
		}
		for(List<Integer> list : threeSum2(n1)){
			//System.out.println(list);
		}
		for(List<Integer> list : threeSum3(n1)){
			System.out.println(list);
		}
		System.out.println("TEST CASE 2");
		int[] a2 = {-1, 0, 1, 2, -1, -4};
		for(List<Integer> list : threeSum1(a2)){
			//System.out.println(list);
		}
		for(List<Integer> list : threeSum2(a2)){
			//System.out.println(list);
		}
		for(List<Integer> list : threeSum3(a2)){
			System.out.println(list);
		}
		System.out.println("TEST CASE 3");
		int[] a3 = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
		for(List<Integer> list : threeSum1(a3)){
			//System.out.println(list);
		}
		for(List<Integer> list : threeSum2(a3)){
			//System.out.println(list);
		}
		for(List<Integer> list : threeSum3(a3)){
			System.out.println(list);
		}
	}
	
	//TIME LIMIT EXCEED for the TEST CASE 3 in this file on the OJ LEETCODE
	private static List<List<Integer>> threeSum2(int[] nums) {
		Arrays.sort(nums);
		HashMap<Integer, Integer> cache =  new HashMap<>();
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		List<List<Integer>> result =  new ArrayList<>();

		for(int i = 0; i < nums.length ; i++){
			cache.put(nums[i], i);
		}

		for(int i = 0 ; i < nums.length; i++){
			for(int  j = i+1; j < nums.length ; j++){
				int sum = nums[i] + nums[j];
				int index = 0;
				if(cache.containsKey(-sum) ){
					index = cache.get(-sum);
					if(index != i && index != j && index > j){
						ArrayList<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(-sum);
						if(set.add(list)){
							result.add(list);
						}
					}
				}
			}
		}
		return result;
	}
	
	//CODE AFTER SEEING THE SOLUTION ACCEPTED SOLUTION
	private static List<List<Integer>> threeSum3(int[] nums) {
		Arrays.sort(nums);
		HashMap<Integer, Integer> cache =  new HashMap<>();
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		List<List<Integer>> result =  new ArrayList<>();

		for(int i = 0 ; i < nums.length; i++){
			int j = i+1;
			int k = nums.length-1;
			while (j<k){
				int sum = nums[i] + nums[j] + nums[k];
				if(sum == 0){
					ArrayList<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					if(set.add(list)){
						result.add(list);
					}
					j++;
					k--;
				}
				else if (sum > 0){
					k--;
				}
				else{
					j++;
				}
			}
		}
		return result;
	}
	
	//N^2logN solution and the solution doesn't have sorted elements within the arraylist
	public static List<List<Integer>> threeSum1(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result =  new ArrayList<>();
		for(int i = 0 ; i < nums.length; i++){
			for(int j = i+1 ; j < nums.length ; j++){
				int sum = nums[i] + nums[j];
				int index = Arrays.binarySearch(nums,j,nums.length, -sum);
				if(index >= 0 && index != i && index != j){
					ArrayList<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[index]);
					result.add(list);
				}	
			}
		}
		return result;
	}
}
