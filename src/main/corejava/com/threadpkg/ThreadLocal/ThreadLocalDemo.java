package com.threadpkg.ThreadLocal;

public class ThreadLocalDemo {
	static ThreadLocal<Integer> tlocal = new ThreadLocal<Integer>();

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getId());

		// sets the current thread's copy of this thread-local variable to the
		// specified value.

		tlocal.set(100);
		// returns the current thread's value of this thread-local
		System.out.println("value = " + tlocal.get());

		tlocal.set(0);
		// returns the current thread's value of this thread-local
		System.out.println("value = " + tlocal.get());

		ThreadLocalDemo2.main();
	}
}