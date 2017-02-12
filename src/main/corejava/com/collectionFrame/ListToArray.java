package com.collectionFrame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		
		//String array
		String[] words = {"ace", "boom", "crew", "dog", "eon"};
		//Use Arrays utility class
		List<String> wordList = Arrays.asList(words);
		//Now you can iterate over the list
		System.out.println(wordList);
		
		
		//String array
		Integer[] nums = {1,2,3,4};
		//Use Arrays utility class
		List<Integer> numsList = Arrays.asList(nums);
		System.out.println(numsList);
		Collections.reverse(numsList);
		System.out.println(numsList);
		
		
		
		
		List<String> lst = new ArrayList<String>();
		lst.add("alpha");
		lst.add("beta");
		lst.add("charlie");

		// Use the Object[] version
		Object[] strArray1 = lst.toArray();
		System.out.println(Arrays.toString(strArray1)); // [alpha, beta, charlie]

		// Use the generic type verion - Need to specify the type in the argument
		String[] strArray2 = lst.toArray(new String[0]);
		strArray2[0] = "delta"; // modify the returned array
		System.out.println(Arrays.toString(strArray2)); // [delta, beta, charlie]
		System.out.println(lst); // [alpha, beta, charlie] - no change in the original list
	}
}