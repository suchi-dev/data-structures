package com.example.practice.ds;

public class Node {

	Node left;
	Node right;
	Node next;
	int lis;
	int height;
	int data;
	int size;
	Color color;
	
	
	public static Node addNode(int data) {
		Node n = new Node();
		n.left=null;
		n.right=null;
		n.height=1;
		n.lis=-1;
		n.size=1;
		n.color=Color.Red;
		return n;
	}
	

}


class NodeRef{
	Node node;
}


enum Color{
	Black,
	Red
}