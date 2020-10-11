package com.capgemini.hashtablesbinarytrees;

import com.capgemini.datastructures.INode;

public class MyBinarySearchTree {
	public MyBinaryNode root;

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
				if ((root.left)==null)
					root.left=myNode;
				else
				compareLeft(root.left, myNode);
			} else
				if ((root.right)==null)
					root.right=myNode;
				else
				compareRight(root.right, myNode);

		}

	}

	private void compareLeft(MyBinaryNode leftNode, MyBinaryNode myNode) {
		if (leftNode == null) {
			leftNode = myNode;
			System.out.println(root.left.key);
			}
		else {
			if ((leftNode.key).compareTo((myNode.key)) > 0) {
				if ((leftNode.left)==null)
					leftNode.left=myNode;
				else
				compareLeft(leftNode.left, myNode);
			} else
				if ((leftNode.right)==null)
					leftNode.right=myNode;
				else
				compareRight(leftNode.right, myNode);
		}
	}

	private void compareRight(MyBinaryNode rightNode, MyBinaryNode myNode) {
		if (rightNode == null) {
			rightNode = myNode;
			System.out.println(root.right.key);
		}
		else {
			if ((rightNode.key).compareTo((myNode.key)) > 0) {
				if ((rightNode.left)==null)
					rightNode.left=myNode;
				else
				compareLeft(rightNode.left, myNode);
			} else
				if ((rightNode.right)==null)
					rightNode.right=myNode;
				else
				compareRight(rightNode.right, myNode);
		}
	}
}
