package ProjectFiles;

import java.util.Arrays;

public class SearchInRotatedArray {

	public static void main(String[] args) {

		System.out.println(search(new int[]{2} , 2));
		System.out.println(search(new int[]{6,7,7,7,1,1,1,2} , 6));

	}

	private static int search1(int[] nums, int target) {
		if(nums == null || nums.length == 0){
			return -1;
		}
		int left = 0;
		int right = nums.length -1;
		int result = 0;
		while(right - left >= 2){
			if(nums[right] >= nums[left]){
				result = Arrays.binarySearch(nums, left, right+1, target);
				if( result >= 0){
					return result;
				}
				else
					return -1;
			}
			else{
				int mid = (left + right )/2;

				if(target == nums[mid])
					return mid;
				if(target == nums[left])
					return left;
				if(target == nums[right])
					return right;
				if((target > nums[mid] && target > nums[right]) ||   (target < nums[mid] && target < nums[right]) ){
					left = mid+1;
				}
				else if((target < nums[mid] && target > nums[right]) || (target > nums[mid] && target < nums[right]) ){
					right = mid-1;
				}
			}	
		}
		if(target == nums[left])
			return left;
		if(target == nums[right])
			return right;
		return -1;
	}

	private static int search(int[] nums, int target) {
		if(nums == null || nums.length == 0)
			return -1;
		int left = 0;
		int right = nums.length -1;
		int mid ;
		int midValue ;
		int result;

		while(right >= left){
			if(nums[right] >= nums[left]){
				result = Arrays.binarySearch(nums, left, right+1, target);
				if( result >= 0){
					return result;
				}
				else
					return -1;
			}
			else{//nums[right] < nums[left] rotated
				mid = (left+right)/2;
				midValue = nums[mid];
				if(target == midValue)
					return mid;
				if(midValue > nums[right]){
					if(target > midValue){
						left = mid + 1;
					}
					else {//target <= midValue 
						if( target > nums[right]){
							right = mid -1;
						}
						else if( target <= nums[right]){
							left = mid + 1;}
					}
				}
				else{//midValue <= nums[right]
					if(target < midValue){
						right = mid -1;
					}
					else{//target >= midValue)
						if(target > nums[right]){
							right = mid -1;
						}
						else{//target <= nums[right]
							left = mid +1;
						}
					}
				}
			}
		}
		return -1;
	}
}
