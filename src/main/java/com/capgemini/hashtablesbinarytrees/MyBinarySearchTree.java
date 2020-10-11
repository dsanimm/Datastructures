package com.capgemini.hashtablesbinarytrees;

import com.capgemini.datastructures.INode;

public class MyBinarySearchTree {
	public MyBinaryNode root;
	private int size;

	public MyBinaryNode getRoot() {
		return root;
	}

	public void setRoot(MyBinaryNode root) {
		this.root = root;
	}

	public <K extends Comparable> void add(MyBinaryNode myNode) {
		if (root == null)
			root = myNode;
		else {
			if ((root.key).compareTo((myNode.key)) > 0) {
				if ((root.left) == null)
					root.left = myNode;
				else
					compareLeft(root.left, myNode);
			} else if ((root.right) == null)
				root.right = myNode;
			else
				compareRight(root.right, myNode);

		}

	}

	private void compareLeft(MyBinaryNode leftNode, MyBinaryNode myNode) {
		if (leftNode == null) {
			leftNode = myNode;
		} else {
			if ((leftNode.key).compareTo((myNode.key)) > 0) {
				if ((leftNode.left) == null)
					leftNode.left = myNode;
				else
					compareLeft(leftNode.left, myNode);
			} else if ((leftNode.right) == null)
				leftNode.right = myNode;
			else
				compareRight(leftNode.right, myNode);
		}
	}

	private void compareRight(MyBinaryNode rightNode, MyBinaryNode myNode) {
		if (rightNode == null) {
			rightNode = myNode;
		} else {
			if ((rightNode.key).compareTo((myNode.key)) > 0) {
				if ((rightNode.left) == null)
					rightNode.left = myNode;
				else
					compareLeft(rightNode.left, myNode);
			} else if ((rightNode.right) == null)
				rightNode.right = myNode;
			else
				compareRight(rightNode.right, myNode);
		}
	}

	public int size() {
		if (root == null)
			return 0;
		else if (root.left != null && root.right != null)
			return size(root.left) + size(root.right) + 1;
		else if (root.left != null)
			return size(root.left) + 1;
		else if (root.right != null)
			return size(root.right) + 1;
		else
			return 1;
	}

	public int size(MyBinaryNode myNode) {
		if (myNode == null)
			return 0;
		else if (myNode.left != null && myNode.right != null)
			return size(myNode.left) + size(myNode.right) + 1;
		else if (myNode.left != null)
			return size(myNode.left) + 1;
		else if (myNode.right != null)
			return size(myNode.right) + 1;
		else
			return 1;

	}
	public <T> boolean search(T key) {
		if (root.key == key)
			return true;
		else if (root==null)
			return false;
					else if (root.left != null && root.right != null)
						return search(root.left,key) || search(root.right,key);
					else if (root.left != null)
						return search(root.left,key);
					else if (root.right !=null)
						return search(root.right,key);
					else return false;
	}

	public <T> boolean search(MyBinaryNode myNode,T key) {
		if (myNode.key == key)
			return true;
		else if (myNode==null)
			return false;
					else if (myNode.left != null && myNode.right != null)
						return search(myNode.left,key) || search(myNode.right,key);
					else if (myNode.left != null)
						return search(myNode.left,key);
					else if (myNode.right !=null)
						return search(myNode.right,key);
					else return false;
	}
}
