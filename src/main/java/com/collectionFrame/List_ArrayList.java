package com.collectionFrame;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) {

		List<Object> arr = new ArrayList<Object>();
		arr.add("sssss");
		arr.add(5);
		arr.add(49946);
		arr.add("eewrws");

		for (Object s : arr) {
			System.out.println(s);
		}

	}
}
