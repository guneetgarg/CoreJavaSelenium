package com.HandlingExceptions;

import java.io.IOException;

public class PropagationException2 {

	void m() {
		try {
			throw new IOException("device error");
		} catch (IOException e) {
			e.printStackTrace();
		}// checked exception
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		PropagationException2 obj = new PropagationException2();
		obj.p();
		System.out.println("normal flow...");
	}
}