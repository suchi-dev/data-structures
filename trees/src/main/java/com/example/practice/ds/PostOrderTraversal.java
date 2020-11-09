package com.example.practice.ds;

/*
 * This class performs postorder traversal using recursion
 * We repeat the below 3 steps for each node (L-R-V)
 * 1.Go to the left node
 * 2.Go to the right node
 * 3.Print the node
 */
public class PostOrderTraversal {

	public void performPostOrderTraversal(Node root) {
		if(root !=null) {
			performPostOrderTraversal(root.left);
			performPostOrderTraversal(root.right);
			System.out.println(root);
		}
	}
	
}
