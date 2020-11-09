package com.example.practice.ds;

import java.util.Stack;

/*
 * This class performs post order traversal using 1 stack.
 * We initialize current as root
 * current is pushed to stack
 * then current => current.left
 * when it does not have a left , we check its right.
 * if right is also null, then it is a leaf node, we pop 
 * it from the stack and print it.
 * Then we check if the stack's peek element has its right side
 * visited. If yes pop it and print it
 * Else current becomes the right node and then the above process is repeated 
 * 
 */
public class PostOrderTraversalOneStack {

	public void postOrder(Node root) {
		Node current = root;
		Stack<Node> stack = new Stack<Node>();
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				Node temp = stack.peek().right;
				// leaf node
				if (temp == null) {
					temp = stack.pop();
					System.out.println(temp.data);
					// we check if the top most element's right is visited 
					while (!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.println(temp);
					}
				} else {
					current = temp;
				}

			}
		}
	}

}
