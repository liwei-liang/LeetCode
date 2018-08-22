package Step3;


public class MaximumDepthofBinaryTree104 {
    public int maxDepth(TreeNode root) {
    	return helper(root,0);        
    }
    
    public static int helper(TreeNode node, int length){
    	if(node == null)
    		return length;
    	if(node.left == null && node.right == null)
    		return length+1;
    	return Math.max(helper(node.left,length+1), helper(node.right,length+1));
    	
    }
}
