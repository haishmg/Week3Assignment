package Trees;

public class Balanced {

    public Integer depth(TreeNode a) {
        if (a == null) return 0;
        
        Integer left = depth(a.left);
        Integer right = depth(a.right);
        
        if (left == null || right == null) return null;
        
        if (Math.abs(left - right) > 1) return null;
        
        return Math.max(left, right) + 1;
	}
    
	public int isBalanced(TreeNode a) {
	    return depth(a) == null ? 0 : 1;
	}
}
