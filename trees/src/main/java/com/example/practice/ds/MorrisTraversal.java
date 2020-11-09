package com.example.practice.ds;

public class MorrisTraversal {

	public void inorder(Node root) {
		Node current = root;
		while (current != null) {
			// no left nodes for current. So we print it and move to right
			if (current.left == null) {
				System.out.println(current.data);
				current = current.right;

			} else {
				Node predecessor = current.left;
				while (predecessor.right != null && predecessor.right != current) {
					predecessor = predecessor.right; 

				}
				// we need to create a link with current and predecessor's right.
				// Also current should be the next left node
				if (predecessor.right == null) {
					predecessor.right = current;
					current = current.left;

				} // the left side is visited, breaking the link. So we print the data and move to
					// right

				else {
					predecessor.right = null;
					System.out.println(current.data);
					current = current.right;

				}

			}

		}
	}
	
	
	public void preorder(Node root) {
		Node current = root;
		while(current !=null) {
			if(current.left == null) {
				System.out.println(current.data);
				current = current.right;
			}else {
				Node predecessor = current.left;
				while(predecessor.right !=null && predecessor.right !=current) {
					predecessor = predecessor.right;
				}
				
				if(predecessor.right == null) {
					predecessor.right = current;
					System.out.println(current.data);
					current = current.left;
					
				}else {
					predecessor.right = null;
					current = current.right;
				}
			}
		}
	}

}
