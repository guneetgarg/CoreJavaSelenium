package com.threadpkg.ThreadLocal;

public class ThreadLocalDemo2 {

	public static void main() {

		ThreadLocal<Integer> tlocal = new ThreadLocal<Integer>();

		// sets the current thread's copy of this thread-local variable to the
		// specified value.

		tlocal.set(100);
		// returns the current thread's value of this thread-local
		System.out.println("value = " + tlocal.get());

		// returns the current thread's value of this thread-local
		System.out.println("value = " + tlocal.get());
	}
}