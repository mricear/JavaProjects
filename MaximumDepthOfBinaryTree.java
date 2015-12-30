package ProjectFiles;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		
	}
	
    public static int maxDepth(TreeNode root) {
        if(root == null)
        	return 0;
        
        return Integer.max(maxDepth(root.left), maxDepth(root.right)) +1;
    }

}
