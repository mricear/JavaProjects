package ProjectFiles;

public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		System.out.println(findMin(new int[]{2}));
		System.out.println(findMin(new int[]{4,5,6,6,6,6,1}));
		System.out.println(findMin(new int[]{4,5,1,2,2,2,2,2,2,2,2,3}));
		System.out.println(findMin(new int[]{3,3,1,3}));
		System.out.println(findMin(new int[]{2,0,0,0,1,2}));
	}
	
    public static int findMin(int[] nums) {
        if(nums == null || nums.length  == 0 )
        	return 0;
        
        int l = 0, h = nums.length -1, mid = (l+h) /2;
        while( l <= h){
        	mid = (l+h) /2;
        	if(mid -1 >= 0 ){
        		if(nums[mid -1] > nums[mid])
        		return nums[mid];
        	}
        	else if(mid == 0){
        		if(nums[mid] <= nums[nums.length -1]){
        			return nums[mid];
        		}
        	}
        	if(nums[mid] > nums[h]){
        		l = mid + 1;
        	}
        	else if(nums[mid] < nums[h]) {
        		h = mid;
        	}
        	else{
        		h--;
        	}
        }
        return -1;
    }

}
