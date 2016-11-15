package com.Tree;

public class Node 
{
	Node left;
	Node right;
	int data;
	public Node() {
		
		this.left = null;
		this.right = null;
		this.data = 0;
	}
	public Node( int data) {
		
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
