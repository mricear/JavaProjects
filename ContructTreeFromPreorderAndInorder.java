package ProjectFiles;

public class ContructTreeFromPreorderAndInorder {

	public static void main(String[] args) {
		
	}
	
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        
    	return helper(0, preorder, inorder, 0, inorder.length -1);
    }

	private static TreeNode helper(int preStart, int[] preorder, int[] inorder, int s, int e) {
		
		if(preStart > preorder.length - 1 || s > e)
			return null;
		
		TreeNode n = new TreeNode(preorder[preStart]);
		
		int index = find(preorder[preStart], inorder,s,e);
		n.left = helper(preStart + 1, preorder, inorder, s,index -1);
		n.right = helper(preStart + index - s + 1, preorder, inorder, index+1, e);
		
		return n;
	}

	private static int find(int n, int[] inorder, int s, int e) {
		for(int i = s; i <= e ; i++){
			if(inorder[i] == n)
				return i;
		}
		return -1;
	}

}
