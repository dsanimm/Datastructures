package com.capgemini.datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyNodeTest {
	private MyNode<Integer> MyFirstNode;
	private MyNode<Integer> MySecondNode;
	private MyNode<Integer> MyThirdNode;
	private LinkedList myLinkedList;

	@Before
	public void setup() {
		MyFirstNode = new MyNode<Integer>(56);
		MySecondNode = new MyNode<Integer>(30);
		MyThirdNode = new MyNode<Integer>(70);
		myLinkedList = new LinkedList();
	}

	@Test
	public void Given3Numbers_WhenLinked_ReturnsTrue() {

		myLinkedList.add(MyFirstNode);
		myLinkedList.add(MySecondNode);
		myLinkedList.add(MyThirdNode);

		boolean result = myLinkedList.getHead().equals(MyThirdNode)
				&& myLinkedList.getHead().getNext().equals(MySecondNode) && myLinkedList.getTail().equals(MyFirstNode);
		assertEquals(true, result);
	}

	@Test
	public void Given3Numbers_WhenLinkedUsingAppend_ReturnsTrue() {

		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyThirdNode);

		boolean result = myLinkedList.getHead().equals(MyFirstNode)
				&& myLinkedList.getHead().getNext().equals(MySecondNode) && myLinkedList.getTail().equals(MyThirdNode);
		assertEquals(true, result);
	}

	@Test
	public void True_If_Insertion_Between_happens() {

		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MyThirdNode);
		myLinkedList.appendBetweenTwo(MySecondNode, MyFirstNode, MyThirdNode);

		boolean result = myLinkedList.getHead().equals(MyFirstNode)
				&& myLinkedList.getHead().getNext().equals(MySecondNode) && myLinkedList.getTail().equals(MyThirdNode);
		assertEquals(true, result);
	}

	@Test
	public void True_If_Head_deleted() {

		myLinkedList.add(MyFirstNode);
		myLinkedList.add(MySecondNode);
		myLinkedList.add(MyThirdNode);
		myLinkedList.deleteFirst();
		boolean result = myLinkedList.getHead() == MySecondNode;
		assertEquals(true, result);
	}
}
