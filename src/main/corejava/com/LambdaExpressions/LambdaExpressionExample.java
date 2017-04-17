package com.LambdaExpressions;

interface Drawable {
	public void draw();
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		int width = 10;

		/* (argument-list) -> {body}
		 * 
		 * 1) Argument-list: It can be empty or non-empty as well.
		 * 2) Arrow-token: It is used to link arguments-list and body of expression.
		 * 3) Body: It contains expressions and statements for lambda expression.
		 */
		Drawable d2 = () -> {System.out.println("Drawing " + width);};
		d2.draw();
	}
}