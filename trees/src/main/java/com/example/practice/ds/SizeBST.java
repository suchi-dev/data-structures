package com.example.practice.ds;

public class SizeBST {

	/*
	 * This method calculates the number of nodes 
	 * in a binary tree which is the size of the tree
	 */
	public int calculateSize(Node root) {
		if(root == null) {
			return 0;
		}
		int leftSize = calculateSize(root.left);
		int rightSize = calculateSize(root.right);
		return leftSize + rightSize + 1;
		
	}
}
