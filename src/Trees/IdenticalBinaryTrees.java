package Trees;

public class IdenticalBinaryTrees {
    public int isSameTree(TreeNode A, TreeNode B) {
        if(A == null && B == null) {
            return 1;
        }
        
        if((A == null && B != null) ||(A != null && B == null)) {
            return 0;
        }

        if((A.val == B.val) && A.left == null && A.right == null) {
          return 1;   
        }
        
        if(A.val != B.val && A.left == null && A.right == null) {
          return 0;   
        }
        
        return (1 * isSameTree(A.left,B.left)  * isSameTree(A.right,B.right));
    
    }
}
