package Trees;

public class PathSum {
	public int hasPathSum(TreeNode a, int b) {
	    
	    // if we reached a leaf, return 1 iff leaf val equals leftover sum
	    if(a.left == null && a.right == null){
	        if(a.val == b){
	            return 1;
	        }
            return 0;
	    }
	    
	    // check both paths tomthe bottom and return 1 if any of them matches
        if((a.left != null && hasPathSum(a.left, b - a.val) == 1) ||
           (a.right != null && hasPathSum(a.right, b - a.val) == 1)){
            return 1;
        }
	    
	    return 0;
	}
}
