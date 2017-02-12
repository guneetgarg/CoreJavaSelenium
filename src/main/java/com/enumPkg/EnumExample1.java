package com.enumPkg;

class EnumExample1 {

	// Every enum internally implemented by using Class.
	public static void main(String[] args) {
		Color c1 = Color.ORANGE;
		System.out.println(c1);

		System.out.println(Color.BLACK);

		System.out.println(Color.values().length);

		for (Color c : Color.values()) {
			System.out.println(c + " -> " + c.value);

		}
	}
}