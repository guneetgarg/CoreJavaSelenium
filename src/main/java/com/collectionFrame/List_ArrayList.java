package com.collectionFrame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) {

		List<Object> arr = new ArrayList<Object>();
		arr.add("sssss");
		arr.add(5);
		arr.add(49946);
		arr.add("eewrws");

		System.out.println(arr);
		for (Object s : arr) {
			System.out.println(s);
		}
		
		System.out.println("********************");
		
		Iterator<Object> itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
