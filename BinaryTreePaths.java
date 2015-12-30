package ProjectFiles;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode( 1);
		TreeNode n2 = new TreeNode( 2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		n7.left = n6;
		n7.right = n5;
		n5.left = n1;
		n5.right = n2;
		n6.right = n4;
		n6.left = n3;
		List<String> listOfStrings = binaryTreePaths(n7);
		for(String s: listOfStrings){
			System.out.println(s);
		}
	}

	public static List<String> binaryTreePaths(TreeNode root) {
		if(root == null){
			return new ArrayList<String>();
		}
		if(root.left == null && root.right == null){
			ArrayList<String> a = new ArrayList<>();
			a.add(root.val+"");
			return a;
		}
		ArrayList<String> aList = new ArrayList<String>();
		btPaths(root.left, root.val+ "" , aList);
		btPaths(root.right, root.val+ "" , aList);
		return aList;
	}

	private static ArrayList<String> btPaths(TreeNode root, String string, ArrayList<String> aList) {
		if(root == null){
			return aList;
		}
		if(root.left == null && root.right == null){
			string = string+ "->"+ root.val;
			aList.add(string);
			return aList;
		}
		btPaths(root.left, string+ "->"+root.val, aList);
		btPaths(root.right, string+ "->"+root.val, aList);
		return aList;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
