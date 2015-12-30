package ProjectFiles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		//		n7.left = n5;
		n7.right = n6;
		//		n5.left = n1;
		//		n5.right = n2;
		n6.right = n4;
		n6.left = n3;
		List<List<Integer>> ll = levelOrder1(n7);
		for(List<Integer> l : ll){
			for(int i : l ){
				System.out.print(i);
			}
			System.out.println();
		}
	}

	//This function DOESN't WORK
	public static List<List<Integer>> levelOrder1(TreeNode root) {
		List<List<Integer>>  result = new ArrayList<List<Integer>>();
		if(root == null)
			return result;
		int height = height(root);
		TreeNode[] a = new TreeNode[(int) Math.pow(2, height)];
		a[1] = root;
		for(int i = 1; i < a.length ; i++){
			if(a[i] != null){
				if(a[i].left != null){
					a[2*i] = a[i].left;
				}
				if(a[i].right != null){
					a[2*i + 1] = a[i].right;
				}
			}
		}

		List<Integer> l = new ArrayList<>();

		for(int i = 1, level = 1; i <= a.length - 1 ; i++){
			if(i == Math.pow(2, level))
			{
				result.add(l);
				l = new ArrayList<>();
				//				System.out.println();
				level++;
			}

			if(a[i] != null){
				l.add(a[i].val);
				//				System.out.print(a[i].val);
			}
		}

		if(!result.contains(l)){
			result.add(l);
		}

		return result;
	}

	private static int height(TreeNode root){
		if(root == null)
			return 0;

		return Integer.max(height(root.left), height(root.right)) + 1;
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<>();
		List<Integer> l;
		q.add(root);
		while(!q.isEmpty()){
			l = new ArrayList<>();
			int size = q.size();
			for(int i = 0; i < size; i++){
				TreeNode n = q.poll();
				l.add(n.val);
				
				if(n.left != null)
					q.add(n.left);
				
				if(n.right != null)
					q.add(n.right);
			}
			result.add(l);
		}
		return result;
	}

}
