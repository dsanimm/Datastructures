package com.capgemini.stacksandqueues;

import com.capgemini.datastructures.INode;
import com.capgemini.datastructures.LinkedList;
import com.capgemini.datastructures.MyNode;

public class Stack {
	LinkedList myLinkedList = new LinkedList();

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public MyNode peak() {
		
		return (MyNode) myLinkedList.getHead();
	}

	public void printSatck() {
		myLinkedList.printList();
	}
}
