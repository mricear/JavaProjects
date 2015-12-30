package ProjectFiles;

import ProjectFiles.BinaryTreePaths;

public class Flatten {

	static TreeNode prev = null;

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		n7.left = n5;
		n7.right = n6;
		n5.left = n1;
		n5.right = n2;
		n6.right = n4;
		n6.left = n3;
		flatten(n7);
		TreeNode r = n7;
		while(n7  != null){
			System.out.print(n7.val + ",");
			n7 = n7.right ;
		}
	}

	public static void flatten1(TreeNode root) {

		if(prev == null){
			prev = root;
		}

		if(root == null)
			return;

		if(prev != null && root!= prev){
			prev.right = root;
			prev.left = null;
			prev = root;
		}

		flatten1(root.left);
		flatten1(root.right);

	}

	public static void flatten(TreeNode root) {
		if(root == null)
			return;

		flatten(root.left);
		flatten(root.right);

		TreeNode  middleS, middleE = null;
		if(root.left != null){
			middleS = root.left; 
			TreeNode t = root.left;
			while(t.right != null){
				t = t.right;
			}
			middleE = t;
		}
		else{
			return;
		}

		middleE.right = root.right;
		root.right = middleS;
		root.left = null;

//		root.left.right = root.right;
//		root.right = root.left;
//		root.left = null;
	}

}

