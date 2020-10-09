package com.capgemini.stacksandqueues;

import com.capgemini.datastructures.INode;
import com.capgemini.datastructures.LinkedList;
import com.capgemini.datastructures.MyNode;

public class Queue {
	LinkedList myLinkedList = new LinkedList();

	public void enQueue(INode myNode) {
		myLinkedList.append(myNode);
	}

	public void printQueue() {
		myLinkedList.printList();
	}

	public void deQueue() {
		myLinkedList.deleteLast();
	}
}
