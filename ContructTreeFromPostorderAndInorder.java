package ProjectFiles;

public class ContructTreeFromPostorderAndInorder {

	public static void main(String[] args) {

	}

	public static TreeNode buildTree(int[] inorder, int[] postorder) {
		return helper(postorder.length - 1 , 0, inorder.length - 1, inorder, postorder);
	}

	private static TreeNode helper(int postStart, int s, int e, int[] inorder, int[] postorder) {

		if(postStart < 0 || s > e){
			return null;
		}

		TreeNode n = new TreeNode(postorder[postStart]);
		int index = 0 ;
		for(int i = s; i<= e ; i++){
			if(inorder[i] == postorder[postStart]){
				index = i;
			}
		}
		//leftPortion is from s to index - 1 and rightPortion is from index+1 to e 
		
		n.left = helper(postStart - (e - index )-1, s, index -1, inorder, postorder);
		n.right = helper(postStart - 1, index + 1, e , inorder, postorder);
		
		return n;
	}

}
