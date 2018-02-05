package Trees;

public class Inorder {

    public int[] inorderTraversal(TreeNode A) {
        ArrayList<Integer> inOrderNodes = new ArrayList<Integer>();
        if(A == null) {
            return new int[0];
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = A;
        while(node != null) {
            stack.push(node);
            node = node.left;
        }
        while(stack.size() > 0) {
           node = stack.pop();
           inOrderNodes.add(node.val);
           if(node.right!= null) {
               node = node.right;
               while(node != null) {
                   stack.push(node);
                   node = node.left;
               }
           }
        }
        int[] intArray = new int[inOrderNodes.size()];
        for(int i=0; i<inOrderNodes.size(); i++) {
            intArray[i] = inOrderNodes.get(i);
        }
        return intArray;
    }
}
