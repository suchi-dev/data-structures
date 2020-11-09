package com.example.practice.ds;

public class HeightBT {

	/*
	 * This method calculates the height of a binary tree 
	 * Calculates left height
	 * Calculates right height 
	 * max(leftHeight, rightHeight) + 1 This is done for
	 * every node in the tree
	 */
	public int calculateHeight(Node root) {
		if (root == null) {
			return 0;

		}

		int leftHeight = calculateHeight(root.left);
		int rightHeight = calculateHeight(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}
}
