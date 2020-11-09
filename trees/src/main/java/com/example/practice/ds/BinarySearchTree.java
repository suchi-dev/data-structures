package com.example.practice.ds;

public class BinarySearchTree {

	public Node addNode(int data, Node head) {
		Node root = head;
		Node n = Node.addNode(data);
		if (head == null) {
			head = n;
			return head;
		}
		Node prev = null;
		while (head != null) {
			prev = head;
			if (head.data < data) {
				head = head.right;
			} else {
				head = head.left;
			}
		}
		if (prev.data < data) {
			prev.right = n;
		} else {
			prev.left = n;
		}

		return root;
	}

	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		Node head = null;
		head = bt.addNode(10, head);
		head = bt.addNode(5, head);
		head = bt.addNode(7, head);
		head = bt.addNode(19, head);
		head = bt.addNode(21, head);
		head = bt.addNode(20, head);
		head = bt.addNode(-1, head);
		head = bt.addNode(21, head);

	}

}
