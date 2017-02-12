package com.enumPkg;

class EnumExample2 {
	enum Season {
		WINTER(5), SPRING(10), SUMMER(15), FALL(20);
		private int value;

		private Season(int value) {
			this.value = value;
		}
	}

	public static void main(String args[]) {

		Season arr[] = Season.values();
		for (Season col : arr) {
			// Calling ordinal() to find index of color.
			System.out.println(col + " -> at index " + col.ordinal() + " -> " + col.value);
		}

	}

}