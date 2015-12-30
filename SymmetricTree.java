package ProjectFiles;

public class SymmetricTree {

	public static void main(String[] args) {

	}

	public static boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;
		return checkIfMirrorImage(root.left, root.right);
	}

	private static boolean checkIfMirrorImage(TreeNode r1, TreeNode r2) {
		if(r1 == null || r2 == null)
			return r1 == r2;

		if(r1.val != r2.val)
			return false;

		return checkIfMirrorImage(r1.left, r2.right) && checkIfMirrorImage(r1.right, r2.left);

	}

}
