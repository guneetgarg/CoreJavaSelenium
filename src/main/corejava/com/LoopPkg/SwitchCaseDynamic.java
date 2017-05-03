package com.LoopPkg;

public class SwitchCaseDynamic {
	public static void main(String[] args) {
		int num = 1;
		final int num1 = 1;
		switch (num) {
		case 20 * 1:

			break;
		case num1:

			break;
		case 20 - 2:

			break;
		/*
		 * case expressions must be constant expressions
		 */
		// case num:

		default:
			break;
		}
	}
}
