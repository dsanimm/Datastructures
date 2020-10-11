package com.capgemini.hashtablesbinarytrees;

import com.capgemini.datastructures.INode;

public class HashMapNode<K, V> implements INode<K> {
	K key;
	V value;
	HashMapNode<K, V> next;

	public HashMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode next) {
		this.next = (HashMapNode<K, V>) next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{K=").append(key).append("|V=").append(value).append("}");
		if (next != null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}
} 