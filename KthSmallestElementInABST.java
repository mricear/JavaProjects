package ProjectFiles;

public class KthSmallestElementInABST {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode( 1);
		TreeNode n2 = new TreeNode( 2);
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
		System.out.println(kthSmallest(n7, 3));
		
	}

	public static int kthSmallest(TreeNode root, int k) {
		KthSmallestElement kel = new  KthSmallestElement();
		kel.ks = 0;
		kel.result = 0;
		findKthSmallest(root, k,kel);
		return kel.result;
	}

	public static void findKthSmallest(TreeNode root, int k, KthSmallestElement Kel){
		if(root == null){
			return ;
		}
		findKthSmallest(root.left, k, Kel);
		Kel.ks += 1;
		if(Kel.ks == k){
			Kel.result = root.val;
		}
		
		findKthSmallest(root.right, k, Kel);
	}

}
class KthSmallestElement{
	int ks;
	int result;
}