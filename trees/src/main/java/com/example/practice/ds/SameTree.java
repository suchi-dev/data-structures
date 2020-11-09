package com.example.practice.ds;

public class SameTree {
	
	/*
	 * Given roots of 2 trees, it checks if their structure, ie. 
	 * root's left and right are same.
	 */
	public boolean checkForSameTree(Node root1, Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null || root2==null) {
			return false;
		}
		
		return root1.data == root2.data &&
			checkForSameTree(root1.left, root2.left) &&
			checkForSameTree(root1.right, root2.right);
		
	}

}
