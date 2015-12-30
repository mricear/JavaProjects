package ProjectFiles;

public class LowestCommonAncestorinBST {

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
		System.out.println(lowestCommonAncestor(n5, n1, n7).val);
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || root == p || root == q || (root.val > p.val && root.val < q.val)
				|| (root.val > q.val && root.val < p.val))
			return root;
		
		TreeNode l = null,r = null;
		if(root.val > p.val && root.val > q.val )
			l = lowestCommonAncestor(root.left, p, q);
		
		else if(root.val < p.val && root.val < q.val)
			r =lowestCommonAncestor(root.right, p, q);
			
		return l != null ? l : r;
	}
}
