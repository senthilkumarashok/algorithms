package com.leslie.tree;

import java.util.Arrays;
import java.util.LinkedList;

public class TreeSerializer {
	
	
   	/**
	 * Encodes a tree to a single string. EX: 1, 2, 3, null, 8
	 * @param root
	 * @return
	 */
    public String serialize(TreeNode root) {
    	
        if (root == null) return "null";
        
        return Integer.toString(root.val) + "," + serialize(root.left) + "," + serialize(root.right);
        
    }


    /**
     * Decodes encoded data to tree.
     * @param values
     * @return
     */
    public TreeNode deserialize(Integer[] values){
    	
    	LinkedList<Integer> data = new LinkedList<>(Arrays.asList(values));
    	
    	return deserialize(data);
    	
    }
    
    private TreeNode deserialize(LinkedList<Integer> data) {
	
        if (data.peek() == null) {
            data.poll();
            return null;
        }
        TreeNode root = new TreeNode(data.poll());
        root.left = deserialize(data);
        root.right = deserialize(data);
        return root;
    }

}
