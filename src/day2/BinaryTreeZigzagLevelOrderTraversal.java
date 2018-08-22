package day2;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> listBylevel = new ArrayList<>();
    	if(root==null)
    		return listBylevel;
        List<Deque<TreeNode>> listDeque = new ArrayList<>();
    	Deque<TreeNode> deque = new LinkedList<>();
    	deque.offer(root);
    	listDeque.add(deque);
    	helper(listDeque,deque);
    	for(int i =0; i< listDeque.size();i++){
	    	List<Integer> listLevel1 = new ArrayList<>();
	    	Deque<TreeNode> dequeC = listDeque.get(i);
    		if(i%2==0){
    	        while(dequeC.size()>0){
    	    		listLevel1.add(dequeC.poll().val);
    	    	}
    		}else{
    	        while(dequeC.size()>0){
    	    		listLevel1.add(dequeC.pollLast().val);
    	    	}
    		}
    		listBylevel.add(listLevel1);
    	}
    	return listBylevel;
    }
    
    public void helper(List<Deque<TreeNode>> listDeque, Deque<TreeNode> deque){
    	Deque<TreeNode> newDeque = new LinkedList<>();
        for(int i = 0; i< deque.size();i++){
        	TreeNode node = deque.pollFirst();
    		if(node.left!=null)
    			newDeque.offer(node.left);
    		if(node.right!=null)
    			newDeque.offer(node.right);
    		deque.offer(node);
    	}
    	if(!newDeque.isEmpty()){
    		listDeque.add(newDeque);
    		helper(listDeque,newDeque);
    	}
    }
    
}
