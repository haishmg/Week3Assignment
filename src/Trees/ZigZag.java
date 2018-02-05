package Trees;

public class ZigZag {
	
   	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
	    ArrayList<ArrayList<Integer>> al = new ArrayList<>();
	    if(a==null){
	        return al;
	    }
	    Queue<TreeNode> qe = new LinkedList<>();
	    qe.add(a);
	    int j=0;
	    while(!qe.isEmpty()){
	        int size = qe.size();
	        int i=0;
	        ArrayList<Integer> al1=new ArrayList<>();
	        while(i<size){
	           TreeNode tr = qe.poll();
	           if(j%2!=0){
	               al1.add(0,tr.val);
	           }else{
	               al1.add(tr.val);
	           }
	           if(tr.left!=null){
	               qe.add(tr.left);
	           }
	           if(tr.right!=null){
	               qe.add(tr.right);
	           }
	           i++;
	        }
	        al.add(al1);
	        j++;
	    }
	    return al;
	}


}
