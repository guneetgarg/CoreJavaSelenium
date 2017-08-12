package com.randomAct;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {

		String[] str = new String[10];

		Optional<String> opt = Optional.ofNullable(str[2]);

		if (opt.isPresent()) { // check for value is present or not
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} else
			System.out.println("string value is not present");

		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index

		Optional<String> checkNull = Optional.ofNullable(str[5]);

		if (checkNull.isPresent()) { // It Checks, value is present or not
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} else
			System.out.println("String value is not present");

	}

}
