package com.capgemini.hashtablesbinarytrees;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyHashMapTest {

	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String sentence = "To be or not to be";
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			System.out.println(word);
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}

		int frequency = myHashMap.get("to");
		assertEquals(2, frequency);
		myHashMap.myLinkedList.printList();

	}
	@Test
	public void givenAParagraphWhenWordsAreAddedToListShouldReturnWordFrequency() {
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = paragraph.toLowerCase().split(" ");

		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value++;
			myLinkedHashMap.add(word, value);
		}
		
		assertEquals(3, (int) myLinkedHashMap.get("paranoid"));
	}
	@Test
	public void givenASentence_WhenWordIsRemoved_ShouldReturnNullFrequency() {
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = paragraph.toLowerCase().split(" ");

		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value++;
			myLinkedHashMap.add(word, value);
		}
		System.out.println("Frequency before deletion : " + myLinkedHashMap.get("avoidable"));
		myLinkedHashMap.remove("avoidable");
		System.out.println("Frequency after deletion : " + myLinkedHashMap.get("avoidable"));
		assertEquals(null, myLinkedHashMap.get("avoidable"));
		System.out.println(myLinkedHashMap.toString());
	}

}
