package com.example.practice.ds;

/*
 * This class uses recursive version to do pre order traversal.
 * We use V-L-R
 * 1.Print the node data
 * 2.Go to its left
 * 3.Go to its right
 * 4.We repeat the above 3 steps for every node
 */
public class PreorderTraversal {
	
	public void performPreorderTraversal(Node root) {
		if(root != null) {
		System.out.println(root);
		performPreorderTraversal(root.left);
		performPreorderTraversal(root.right);
	}
	
	}

}
