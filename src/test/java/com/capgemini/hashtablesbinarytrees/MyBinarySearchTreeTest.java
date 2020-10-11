package com.capgemini.hashtablesbinarytrees;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyBinarySearchTreeTest {

	@Test
	public void testAdd() {
		MyBinarySearchTree myBinarySearchTree =new MyBinarySearchTree();
		MyBinaryNode myBinaryNode1 =new MyBinaryNode(56);
		MyBinaryNode myBinaryNode2 =new MyBinaryNode(30);
		MyBinaryNode myBinaryNode3 =new MyBinaryNode(70);
		MyBinaryNode myBinaryNode4 =new MyBinaryNode(90);
		myBinarySearchTree.add(myBinaryNode1);
		myBinarySearchTree.add(myBinaryNode2);
		myBinarySearchTree.add(myBinaryNode3);
		myBinarySearchTree.add(myBinaryNode4);
		assertEquals(90, myBinarySearchTree.root.right.right.key);
	}

}
