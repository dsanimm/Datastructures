package com.capgemini.hashtablesbinarytrees;

import com.capgemini.datastructures.LinkedList;

public class MyHashMap<K, V> {
	LinkedList<K> myLinkedList;

	public MyHashMap() {
		this.myLinkedList = new LinkedList<>();
	}

	public V get(K key) {
		HashMapNode<K, V> myMapNode = (HashMapNode<K, V>) this.myLinkedList.searchNode(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		HashMapNode<K, V> myMapNode = (HashMapNode<K, V>) myLinkedList.searchNode(key);
		if (myMapNode == null) {
			myMapNode = new HashMapNode<>(key, value);
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}


} 