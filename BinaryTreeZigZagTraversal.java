package ProjectFiles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeZigZagTraversal {

	public static void main(String[] args) {

	}

	public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root == null)
			return result;

		List<Integer> l = new ArrayList<>();
		Stack<TreeNode> q1 = new Stack<>();
		q1.add(root);

		l.add(root.val);
		result.add(l);

		Stack<TreeNode> q2 = new Stack<>();

		while(!q1.isEmpty() || !q2.isEmpty()){
			l = new ArrayList<>();

			while(!q1.isEmpty()){
				TreeNode n = q1.pop();
				if(n.right != null){
					q2.add(n.right);
					l.add(n.right.val);
				}
				if(n.left != null){	
					q2.add(n.left);
					l.add(n.left.val);
				}

			}
			if(!l.isEmpty())
				result.add(l);

			l = new ArrayList<>();

			while(!q2.isEmpty()){
				TreeNode n = q2.pop();
				if(n.left != null){
					q1.add(n.left);
					l.add(n.left.val);
				}
				if(n.right != null){
					q1.add(n.right);
					l.add(n.right.val);
				}

			}
			if(!l.isEmpty())
				result.add(l);
		}
		return result;
	}

	//This one doesn't work
	public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<>();
		List<Integer> l = new ArrayList<>();
		q.add(root);
		boolean flag = false;
		while(!q.isEmpty()){
			for(int i = 0; i < q.size(); i++){
				TreeNode n = q.poll();
				l.add(n.val);
				if(flag){
					q.add(n.right);
					q.add(n.left);
				}
				else{
					q.add(n.left);
					q.add(n.right);
				}
			}
			flag = !flag;
		}
		return result;
	}
	
	public static List<List<Integer>> zigzagLevelOrder3(TreeNode root) {
		
		List<List<Integer>> result = new ArrayList<>();
		
		zigzagHelper(root, 0, result);
		return result;
    }

	private static void zigzagHelper(TreeNode root, int level, List<List<Integer>> result) {
		
		if(root == null)
			return;
		
		if(level >= result.size()){
			List<Integer> li = new LinkedList<Integer>();
			result.add(li);
		}
		
		List<Integer> l =   result.get(level);
		
		if(level % 2  == 0){
			l.add(root.val);
		}
		else{
			l.add(0, root.val);
		}
		zigzagHelper(root.left, level + 1,result);
    	zigzagHelper(root.right, level + 1, result);
	}
}
