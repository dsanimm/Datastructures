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

	public LinkedList(){
		head=null;
		tail=null;
	}
	public void add (INode<K> myNode) {
		if(this.tail==null)
			this.tail=myNode;
		if(this.head==null)
			this.head=myNode;
		else {
			INode tempNode=this.head;
			this.head=myNode;
			this.head.setNext(tempNode);
		}
			
	}
	public void append(INode<K> myNode) {
		if(this.tail==null)
			this.tail=myNode;
		if(this.head==null)
			this.head=myNode;
		else {
			tail.setNext(myNode);
			tail = myNode;
		}
		
			}
	public void appendBetweenTwo(INode<K> myNode1,INode<K> myNode2,INode<K> myNode3) {
		INode<K> temp = head;
		while(temp.getNext()!=null) {
			if (temp==myNode2 && temp.getNext()==myNode3)
				{
				myNode2.setNext(myNode1);
				myNode1.setNext(myNode3);
				}
			}
	}
	
}