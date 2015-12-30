package ProjectFiles;

import java.util.Arrays;

public class ConvertSortedArrayToBST {

	public static void main(String[] args) {

	}
	
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null){
        	return null;
        }
    	return helper(nums, 0, nums.length - 1 );
    }

	private static TreeNode helper(int[] nums, int s, int e) {
		
		if(s > e)
			return null;
		
		int mid = (s + e)/2;
		
		TreeNode root = new TreeNode(nums[mid]);
		
		root.left = helper(nums, s, mid - 1 );
		root.right = helper(nums, mid + 1 , e);
		
		return root;
	}

}
