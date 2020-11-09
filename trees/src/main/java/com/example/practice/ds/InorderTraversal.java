package com.example.practice.ds;
/*
 * This class performs inorder traversal using recursion
 * We repeat the below 3 steps for each node (L-V-R)
 * 1.Go to the left node
 * 2.Print the node
 * 3.Go to the right node
 */
public class InorderTraversal {

	
	public void performInorderTraversal(Node root) {
		if(root !=null) {
			performInorderTraversal(root.left);
			System.out.println(root);
			performInorderTraversal(root.right);
		}
		
	}
}
