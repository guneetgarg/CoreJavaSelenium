package com.genericsJava;

class MyGen<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

class TestGenerics2 {
	public static void main(String args[]) {
		MyGen<Integer> m = new MyGen<Integer>();
		m.add(2);
		MyGen<String> m1 = new MyGen<String>();

		m1.add("vivek");
		System.out.println(m.get());
		System.out.println(m1.get());
	}
}