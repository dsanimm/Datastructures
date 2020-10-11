package com.capgemini.datastructures;

public class LinkedList<K> {
	public INode head;

	public INode getHead() {
		return head;
	}

	public void setHead(INode head) {
		this.head = head;
	}

	public INode getTail() {
		return tail;
	}

	public void setTail(INode tail) {
		this.tail = tail;
	}

	public INode tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void add(INode myNode) {
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

	public void append(INode myNode) {
		if (this.tail == null)
			this.tail = myNode;
		if (this.head == null)
			this.head = myNode;
		else {
			tail.setNext(myNode);
			tail = myNode;
		}

	}

	public void appendBetweenTwo(INode myNode2, INode myNode1, INode myNode3) {
		INode temp = head;
		do {
			if (temp.equals(myNode1) && temp.getNext().equals(myNode3)) {
				myNode1.setNext(myNode2);
				myNode2.setNext(myNode3);
				break;
			}
			temp = (INode<K>) temp.getNext();
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
			temp = (INode) temp.getNext();
		}
	}

	public INode searchNode(K key) {
		INode temp = head;
		if (temp == null)
			return null;
		while (true) {

			if (temp.getKey().equals(key)) {
				return temp;
			}
			if (temp.getNext() == null)
				return null;
			else {
				temp = (INode) temp.getNext();
			}

		}
	}

	public void insertAfterKey(K key, INode myNode) {
		INode temp = head;
		while (true) {
			if (temp.getKey().equals(key)) {
				myNode.setNext(temp.getNext());
				temp.setNext(myNode);
				break;
			}
			temp = (INode) temp.getNext();
		}
	}

	public void deleteWithKey(K key) {
		INode temp = head;
		if (temp != null) {
			while (temp.getNext() != null) {
				if (temp.getNext().getKey().equals(key)) {
					temp.setNext(temp.getNext().getNext());
				}
				temp = (INode) temp.getNext();
				if (temp==null) break;
			}
		}
	}

	public int size(LinkedList a) {
		INode temp = head;
		int size = 0;
		while (temp != (null)) {
			size++;
			temp = (INode) temp.getNext();
		}
		return size;
	}

	public <K extends Comparable> void sortedAdd() {
		INode temp = (INode) head;
		INode temp2;
		if (temp.equals(head) || ((Comparable) temp.getKey()).compareTo((temp.getNext().getKey())) > 0) {
			temp2 = temp;
			temp = (temp.getNext());
			temp2.setNext(temp.getNext());
			temp.setNext(temp2);
			head = temp;
			System.out.println("true");

		}
		if (temp.getNext().getNext().equals(tail)
				|| ((Comparable) temp.getNext().getKey()).compareTo((temp.getNext().getNext().getKey())) > 0) {
			temp2 = temp.getNext();
			temp.setNext(temp.getNext().getNext());
			temp.getNext().setNext(temp2);
			System.out.println("true");

		}
		while (!temp.getNext().getNext().equals(tail)) {
			if (((Comparable) temp.getNext().getKey()).compareTo((temp.getNext().getNext().getKey())) > 0) {
				temp2 = temp.getNext();
				temp.setNext(temp.getNext().getNext());
				temp2.setNext(temp.getNext().getNext());
				temp.getNext().setNext(temp2);
				System.out.println(temp.getKey());
			} // if(temp.getNext().getNext().getNext()==null) break;
			temp = (INode) temp.getNext();

		}
	}

	public void printList() {

		INode temp = head;
		while (!temp.equals(tail)) {
			System.out.print(temp.getKey() + "->");
			temp = temp.getNext();
		}
		System.out.print(temp.getKey());
	}

}