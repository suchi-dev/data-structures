package com.example.practice.ds;

import java.util.List;

public class RootToLeafSumBT {

	/*
	 * Given a sum, we need to find a path from root to leaf with that sum
	 * We perform the below steps for every node in the tree
	 * 1.We subtract from sum the root data and traverse left
	 * 2. We subtract from sum the root data and traverse right
	 * 3.Once we find a leaf node, the node data and  sum  should be equal.
	 * 4.If it matches, we have found a path and we add the nodes from leaf to root
	 * 
	 */
	
	public boolean calculateRootToLeafPath(Node root, int sum, List<Integer> result) {
		if(root == null) {
			return false;
		}
		// check for leaf node
		if(root.left == null && root.right == null) {
			if(root.data == sum) {
				result.add(root.data);
				return true;
			}
		}
		
		if(calculateRootToLeafPath(root.left, sum- root.data, result)) {
			result.add(root.data);
			return true;
			
		}
		if(calculateRootToLeafPath(root.right, sum - root.data, result)) {
			result.add(root.data);
			return true;
		}
		for(Integer i : result) {
			System.out.print("The path is : "+i+":");
		}
		return false;
		
		
	}
}
