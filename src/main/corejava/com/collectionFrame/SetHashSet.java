package com.collectionFrame;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHashSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		
		for(String s : set){
			System.out.println(s);
		}
		
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
		//	String string = (String) itr.next();
			System.out.println(itr.next());
		}
	}
}