package ProjectFiles;

public class IsSameTree {

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
		System.out.print(isSameTree(n3, n3));
	}
	
    public static boolean isSameTree(TreeNode p, TreeNode q) {
       
    	if(p == null && q == null)
    		return true;
    	
    	else if(p == null || q == null)
    		return false;
    	
    	if(p.val != q.val){
    		return false;
    	}
    	
    	return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
