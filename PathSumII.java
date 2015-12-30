package ProjectFiles;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

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
		n5.right = n3;
		n6.right = n4;
		n6.left = n2;
		List<List<Integer>> result = pathSum(n6, 10);
		for(List<Integer> a : result){
			System.out.println(a );
		}
		
	}

	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		
		if(root == null){
			return ll;
		}
		if(root.left == null && root.right == null){
			if(root.val == sum){
				s.add(root.val);
				ll.add(s);
			}
			return ll;
		}
		s.add(root.val);
		pathSumHelper(root.left, root.val , new ArrayList<Integer>(s), sum, ll);
		pathSumHelper(root.right, root.val ,new ArrayList<Integer>(s), sum, ll);
		return ll;
	}

	private static void pathSumHelper(TreeNode root, int curVal, ArrayList<Integer> aList, int sum, List<List<Integer>> listOfLists) {
		if(root == null){
			return;
		}
		if(root.left == null && root.right == null){
			if(curVal + root.val == sum){
				aList.add(root.val);
				listOfLists.add(aList);
			}
			return ;
		}
		aList.add(root.val);
		pathSumHelper(root.left, curVal + root.val, new ArrayList<>(aList), sum, listOfLists);
		pathSumHelper(root.right, curVal + root.val, new ArrayList<>(aList), sum, listOfLists);
	}
}
