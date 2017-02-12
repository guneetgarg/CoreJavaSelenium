package com.collectionFrame;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashSet {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");

		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("************************************************");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			// String string = (String) itr.next();
			System.out.println(itr.next());
		}
	}
}