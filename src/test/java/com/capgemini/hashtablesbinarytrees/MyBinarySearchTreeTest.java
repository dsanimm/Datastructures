package com.capgemini.hashtablesbinarytrees;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.IntStream;

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
	@Test
	public void givenAllNumbers_WhenAddedToBinaryTree_ShouldReturnSizeAsTotalCountOfNumbers() {
		MyBinarySearchTree myBinaryTree = new MyBinarySearchTree();
		int arr[] ={56,30,70,22,40,60,95,11,3,16,65,53,67};
		IntStream st = Arrays.stream(arr);
		st.forEach(k->myBinaryTree.add(new MyBinaryNode(k)));
		assertEquals(13, myBinaryTree.size());
	}
	@Test
	public void givenAllNumbers_WhenAddedToBinaryTree_ShouldReturnSearchTrueIfPresent() {
		MyBinarySearchTree myBinaryTree = new MyBinarySearchTree();
		int arr[] ={56,30,70,22,40,60,95,11,3,16,65,53,67};
		IntStream st = Arrays.stream(arr);
		st.forEach(k->myBinaryTree.add(new MyBinaryNode(k)));
		assertEquals(true, myBinaryTree.search(65));
	}
}
