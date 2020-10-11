package com.capgemini.hashtablesbinarytrees;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.capgemini.datastructures.LinkedList;

public class MyLinkedHashMap<K, V> {
	private final int ARRAY_LENGTH;
	ArrayList<LinkedList<K>> hashArray;

	public MyLinkedHashMap() {
		ARRAY_LENGTH = 10;
		hashArray = new ArrayList<>(ARRAY_LENGTH);
		initializeHashArray();
	}

	public void initializeHashArray() {
		Stream.iterate(0, i -> i + 1).limit(ARRAY_LENGTH).forEach(i -> hashArray.add(null));
	}

	private int getArrayIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		System.out.println(hashCode);
		int arrayIndex = hashCode % ARRAY_LENGTH;
		return arrayIndex;
	}

	public V get(K key) {
		int arrayIndex = this.getArrayIndex(key);
		LinkedList<K> myLinkedList = this.hashArray.get(arrayIndex);
		if (myLinkedList == null)
			return null;
		HashMapNode<K, V> myMapNode = (HashMapNode<K, V>) myLinkedList.searchNode(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		int arrayIndex = this.getArrayIndex(key);
		LinkedList<K> myLinkedList = this.hashArray.get(arrayIndex);
		if (myLinkedList == null) {
			myLinkedList = new LinkedList<>();
			this.hashArray.set(arrayIndex, myLinkedList);
		}
		HashMapNode<K, V> myMapNode = (HashMapNode<K, V>) myLinkedList.searchNode(key);
		if (myMapNode == null) {
			myMapNode = new HashMapNode<>(key, value);
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	public void remove(K key) {
		int arrayIndex = this.getArrayIndex(key);
		LinkedList<K> myLinkedList = this.hashArray.get(arrayIndex);
		if (myLinkedList == null)
			System.out.println("No such word");
		HashMapNode<K, V> myMapNode = (HashMapNode<K, V>) myLinkedList.searchNode(key);
		if (myMapNode == null)
			System.out.println("No such word");
		else
			myLinkedList.deleteWithKey(key);
	}

}