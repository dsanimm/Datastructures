package com.capgemini.stacksandqueues;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.datastructures.MyNode;

public class QueueTest {
	Queue myQueue;
	MyNode myNode1;
	MyNode myNode2;
	MyNode myNode3;
	
	@Before
	public void Queue() {
		myQueue = new Queue();
		myNode1 = new MyNode(30);
		myNode2 = new MyNode(80);
		myNode3 = new MyNode(70);

	}

	@Test
	public void testEnQueue() {
		myQueue.enQueue(myNode1);
		myQueue.enQueue(myNode2);
		myQueue.enQueue(myNode3);
		MyNode result = (MyNode) myQueue.myLinkedList.getHead();
		assertEquals(myNode1, result);
	}

	@Test
	public void testDeQueue() {
		myQueue.enQueue(myNode1);
		myQueue.enQueue(myNode2);
		myQueue.enQueue(myNode3);
		myQueue.deQueue();
		MyNode result = (MyNode) myQueue.myLinkedList.getTail();
		assertEquals(myNode2, result);

		
	}
	


	


}
