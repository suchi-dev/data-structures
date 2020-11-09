package com.example.practice.ds;

import java.util.LinkedList;
import java.util.Queue;

/*
 * This class performs BFS
 */
public class LevelOrderTraversal {

	/*
	 * First add root node in the queue Pop it , print it Check if left and right
	 * exists, add it. Repeat this till queue is empty
	 */
	public void performTraversal(Node root) {
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			root = queue.poll();
			System.out.println(root.data);

			if (root.left != null) {
				queue.add(root.left);
			}
			if (root.right != null) {
				queue.add(root.right);
			}

		}

	}

}
