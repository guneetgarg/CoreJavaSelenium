package com.collectionFrame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) {

		List<Object> arr = new ArrayList<Object>();
		arr.add("AAA");
		arr.add(111);
		arr.add("BBB");
		arr.add(222);

		System.out.println(arr);
		for (Object s : arr) {
			System.out.println(s);
		}

		System.out.println("********************");

		Iterator<Object> itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("********************");

	}
}
