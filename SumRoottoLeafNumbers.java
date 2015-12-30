package ProjectFiles;

public class SumRoottoLeafNumbers {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode( 1);
		TreeNode n2 = new TreeNode( 2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		n6.right = n7;
		n5.left = n3;
		n5.right = n6;
		n3.right = n4;
		n3.left = n2;
		n2.left = n1;
		System.out.println(sumNumbers(n5));
	}

	public static int sumNumbers(TreeNode root) {
		TotalSum s = new TotalSum();
		helper(root, "", s);
		return s.sum;
	}

	private static void helper(TreeNode root, String s, TotalSum sum) {
		if(root == null)
			return ;
		
		if(root.left == null && root.right == null){//reached leaf
			int num = Integer.parseInt(s+ root.val);
			sum.sum = sum.sum + num;
		}
		
		helper(root.left, s + root.val , sum);
		helper(root.right, s +root.val , sum);
	}
}

class TotalSum{
	int sum;
}