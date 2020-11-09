package com.example.practice.ds;

public class SearchBST {
	
	public Node search(Node root, int key) {
		
		if(root == null) {
			return null;
		}
		if (root.data == key) {
			return root;
		}
		else if(root.data < key) {
			search(root.right, key);
		}else {
			search(root.left, key);
		}
		
		return null;
	}

}
