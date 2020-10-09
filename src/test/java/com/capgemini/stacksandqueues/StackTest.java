package com.capgemini.stacksandqueues;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.datastructures.INode;
import com.capgemini.datastructures.LinkedList;
import com.capgemini.datastructures.MyNode;

public class StackTest {
	Stack myStack;
	MyNode myNode1;
	MyNode myNode2;
	MyNode myNode3;

	@Before
	public void setup() {
		myStack = new Stack();
		myNode1 = new MyNode(30);
		myNode2 = new MyNode(80);
		myNode3 = new MyNode(70);

	}

	@Test
	public void testPush() {
		myStack.push(myNode1);
		myStack.push(myNode2);
		myStack.push(myNode3);
		myStack.printSatck();
		MyNode result = myStack.peak();
		assertEquals(myNode3, result);
	}

}
