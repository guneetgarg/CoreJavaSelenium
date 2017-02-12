package com.enumPkg;

public enum Color {
	RED("red color"), ORANGE("orange color"), GRREN("green color"), PURPLE("purple color"), BLACK("black color");
	String value;

	private Color(String value) {
		this.value = value;
	}
}
