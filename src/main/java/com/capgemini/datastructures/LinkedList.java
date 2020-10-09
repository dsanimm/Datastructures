package com.capgemini.datastructures;

public class LinkedList<K> {
	public INode<K> head;

	public INode<K> getHead() {
		return head;
	}

	public void setHead(INode<K> head) {
		this.head = head;
	}

	public INode<K> getTail() {
		return tail;
	}

	public void setTail(INode<K> tail) {
		this.tail = tail;
	}

	public INode<K> tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void add(INode<K> myNode) {
		if (this.tail == null)
			this.tail = myNode;
		if (this.head == null)
			this.head = myNode;
		else {
			INode tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}

	}

	public void append(INode<K> myNode) {
		if (this.tail == null)
			this.tail = myNode;
		if (this.head == null)
			this.head = myNode;
		else {
			tail.setNext(myNode);
			tail = myNode;
		}

	}

	public void appendBetweenTwo(INode<K> myNode2, INode<K> myNode1, INode<K> myNode3) {
		INode<K> temp = head;
		do {
			if (temp.equals(myNode1) && temp.getNext().equals(myNode3)) {
				System.out.println("true");
				myNode1.setNext(myNode2);
				myNode2.setNext(myNode3);
				break;
			}
		} while (true);

	}

	public void deleteFirst() {
		head = (INode<K>) head.getNext();
	}

	public void deleteLast() {
		INode<K> temp = head;
		while (true) {
			if (temp.getNext().equals(this.tail)) {
				this.tail = temp;
				break;
			}
			temp = (INode<K>) temp.getNext();
		}
	}

}