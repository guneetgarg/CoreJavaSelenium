package com.collectionFrame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("FIRST");
		list.add("SECOND");
		list.add("THIRD");

		// Traversing list elements in forward direction using Iterator
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// OUTPUT :
		// FIRST
		// SECOND
		// THIRD
		System.out.println();

		// Traversing list elements in forward direction using ListIterator
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.nextIndex() + " : " + listIterator.next());
		}
		// OUTPUT :
		// FIRST
		// SECOND
		// THIRD
		System.out.println();

		// Traversing list elements in backward direction using ListIterator
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previousIndex() + " : " + listIterator.previous());
		}
		// OUTPUT :
		// THIRD
		// SECOND
		// FIRST
	}
}
