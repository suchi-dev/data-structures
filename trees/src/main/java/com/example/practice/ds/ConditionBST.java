package com.example.practice.ds;
 

/*
 * Given a binary tree, this class helps to determine
 * if it is a binary search tree
 */
public class ConditionBST {
	/*
	 * Here we check at every level if the node value is 
	 * between min and max. Initially for the root it 
	 * is between Integer min and max
	 * At the  left level, it should be between min value and parent
	 * At the right level, it should be between parent and max value
	 *If all the above condns are met, then it is a BST
	 */
	public boolean isBST(Node root, int min, int max ) {
		// if left or right node is null, we return true
		if(root == null) {
			return true;
		}
		if(root.data <= min && root.data > max) {
			return false;
		}
		
		return isBST(root.left, min, root.data) 
			&& isBST(root.right, root.data, max);
		
	}

}
