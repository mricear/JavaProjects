package ProjectFiles;

public class ValidateBST {

	public static void main(String[] args) {
		
	}
	
    public static boolean isValidBST(TreeNode root) {
    	
        return check(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

	private static boolean check(TreeNode root, long maxValue, long minValue) {
		if(root == null)
			return true;
		
		if(root.val > maxValue || root.val < minValue){
			return false;
		}
		return check(root.left, root.val, minValue) && check(root.right, maxValue, root.val);
	}

}
