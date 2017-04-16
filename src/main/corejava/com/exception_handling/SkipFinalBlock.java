package com.exception_handling;

public class SkipFinalBlock {
	public static void main(String[] args) {
		try {
			System.out.println("--------Inside Try Block--------------");
			int data = 25 / 0;
			System.out.println(data);
		} catch (Exception e) {
			System.exit(0);
		} finally {
			System.out.println("finally block is Skipped");
		}
		System.out.println("rest of the code...Skipped");
	}
}