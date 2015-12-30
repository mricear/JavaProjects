package ProjectFiles;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		
	}
	
    public static boolean isBalanced(TreeNode root) {
        if(root == null)
        	return true;
        if(helper(root) != -1)
        	return true;
        else
        	return false;
    }

	private static int helper(TreeNode root) {
		if(root == null)
			return 0;
		
		int lefth = helper(root.left);
		int righth = helper(root.right);
		if(lefth == -1 || righth == -1)
			return -1;
		
		if( Math.abs(lefth - righth) <= 1)
			return Math.max(lefth, righth) + 1;
		else
			return -1;
	}

}
