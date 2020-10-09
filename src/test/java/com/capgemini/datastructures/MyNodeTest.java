package com.capgemini.datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyNodeTest {
	private MyNode<Integer> MyFirstNode;
	private MyNode<Integer> MySecondNode;
	private MyNode<Integer> MyThirdNode;
	private MyNode<Integer> MyFourthNode;

	private LinkedList myLinkedList;

	@Before
	public void setup() {
		MyFirstNode = new MyNode<Integer>(56);
		MySecondNode = new MyNode<Integer>(30);
		MyThirdNode = new MyNode<Integer>(70);
		MyFourthNode = new MyNode<Integer>(80);
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
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyFourthNode);

		myLinkedList.appendBetweenTwo(MyThirdNode, MySecondNode, MyFourthNode);

		boolean result = myLinkedList.getHead().equals(MyFirstNode)
				&& myLinkedList.getHead().getNext().equals(MySecondNode) && myLinkedList.getTail().equals(MyFourthNode) && myLinkedList.getHead().getNext().getNext().equals(MyThirdNode);
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
	@Test
	public void True_If_Tail_deleted() {

		myLinkedList.add(MyFirstNode);
		myLinkedList.add(MySecondNode);
		myLinkedList.add(MyThirdNode);
		myLinkedList.deleteLast();
		boolean result = myLinkedList.getTail() == MySecondNode;
		assertEquals(true, result);
	}
	@Test
	public void True_If_Node_Search_Success() {

		myLinkedList.add(MyFirstNode);
		myLinkedList.add(MySecondNode);
		myLinkedList.add(MyThirdNode);
		INode tempNode = myLinkedList.searchNode(30);
		boolean result = tempNode == MySecondNode;
		assertEquals(true, result);
	}
	@Test
	public void True_If_Node_Insertion_Success() {

		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyFourthNode);
		myLinkedList.insertAfterKey(30, MyThirdNode);
		boolean result = myLinkedList.getHead().getNext().getNext().equals(MyThirdNode);
		assertEquals(true, result);
	}
	@Test
	public void True_If_Node_Deleteion_Success() {

		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyThirdNode);
		myLinkedList.append(MyFourthNode);
		myLinkedList.deleteWithKey(70);
		boolean result = myLinkedList.getHead().getNext().getNext().equals(MyFourthNode) && myLinkedList.size(myLinkedList)==3;
		assertEquals(true, result);
	}
	@Test
	public void True_If_Sorted_Add_Success() {

		myLinkedList.add(MyFirstNode);
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyThirdNode);
		myLinkedList.append(MyFourthNode);
		myLinkedList.sortedAdd();
		System.out.println(myLinkedList.getHead().getKey()+ ""+myLinkedList.getHead().getNext().getKey()+ ""+myLinkedList.getHead().getNext().getNext().getKey()+ ""+myLinkedList.getHead().getNext().getNext().getNext().getKey());
		boolean result = myLinkedList.getHead().equals(MySecondNode)
				&& myLinkedList.getHead().getNext().equals(MyFirstNode) && myLinkedList.getTail().equals(MyFourthNode) 
				&& myLinkedList.getHead().getNext().getNext().equals(MyThirdNode);
		assertEquals(true, result);
	}
}
