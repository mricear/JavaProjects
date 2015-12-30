package ProjectFiles;

import java.util.List;

public class ReverseBinaryTree {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode( 1);
		TreeNode n2 = new TreeNode( 2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		n4.left = n2;
		n4.right = n6;
		n2.left = n1;
		n2.right = n3;
		n6.right = n7;
		n6.left = n5;
		
		reverseTree(n4);
		
		inorder(n4);
	}
	
	private static void inorder(TreeNode root) {
		if(root == null){
			return;
		}
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	public static void reverseTree(TreeNode root){
		if(root == null){
			return;
		}
		
		reverseTree(root.left);
		reverseTree(root.right);
		
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
	}

}
