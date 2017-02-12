package com.collectionFrame;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapHashMap {
	public static void main(String[] args) {
		HashMap<String, Double> map = new HashMap<String, Double>();

		// Adding some elements to HashMap
		map.put("Ashwin", 87.55);
		map.put("Bharat", 95.65);
		map.put("Chetan", 68.13);
		map.put("Dhanjay", 74.23);
		map.put("Kartik", 65.42);

		// HashMap can have one null key and multiple null values
		map.put(null, null);
		map.put("Sandesh", null);

		// Getting the size of the map
		System.out.println("Size Of The Map : " + map.size());
		System.out.println("-----------------");

		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			System.out.println(key + "-->" + map.get(key));
		}
		System.out.println("-----------------");

		// Checking the map for a particular key/value
		System.out.println("Does this map has Chetan as key? " + map.containsKey("Chetan"));
		System.out.println("Does this map has 74.23 as value? " + map.containsValue(74.23));
		System.out.println("-----------------");

		// Removing an element from the map
		System.out.println("Value removed from the map : " + map.remove("Kartik"));

		// traversing Map using entrySet() method
		Set<Entry<String, Double>> entries = map.entrySet();
		for (Entry<String, Double> entry : entries) {
			String key = entry.getKey();
			Double value = entry.getValue();
			System.out.println(key + "  " + value);
		}

	}
}
