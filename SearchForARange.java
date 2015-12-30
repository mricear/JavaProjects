package ProjectFiles;

import java.util.Arrays;

public class SearchForARange {

	public static void main(String[] args) {
		int[] a = {1,3,4,4,4,4,6};
		int[] r = searchRange(a, 4);
		System.out.println(r[0] + " "+ r[1]);
		int[] a1 = {1,3,4,4,4,4,4};
		int[] r1 = searchRange(a1, 4);
		System.out.println(r1[0] + " "+ r1[1]);

		int[] a2 = {4,4,4,4,4,4,4};
		int[] r2 = searchRange(a2, 4);
		System.out.println(r2[0] + " "+ r2[1]);

		int[] a3 = {4,4,4,4,4,4,4};
		int[] r3 = searchRange(a3, 1);
		System.out.println(r3[0] + " "+ r3[1]);
	}

	public static int findLeftStart(int[] nums, int target, int start, int end){
		int mid ;
		while(start <= end){
			mid  = start + (end - start) /2 ;
			if(nums[mid] == target){
				if(mid - 1 < 0 || nums[mid -1]  != target){
					return mid;
				}
				end = mid - 1;
			}
			else if(nums[mid] > target){
				end = mid  - 1;
			}
			else{
				start = mid + 1;
			}
		}
		return -1;
	}

	public static int findRightEnd(int[] nums, int target, int start, int end){
		int mid ;
		while(start <= end){
			mid  = start + (end - start)  /2 ;
			if(nums[mid] == target){
				if(mid + 1 >= nums.length || nums[mid +1]  != target){
					return mid;
				}
				start = mid +1;
			}
			else if(nums[mid] < target){
				start = mid +1;
			}
			else{
				end = mid -1;
			}
		}
		return -1;
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] result =  {-1, -1};
		result[0] = findLeftStart(nums,target, 0, nums.length -1);
		result[1] = findRightEnd(nums,target, 0, nums.length -1);
		return result;
	}



}
