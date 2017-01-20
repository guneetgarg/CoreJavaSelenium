package com.reflectionapi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static Keywords keywords;
	public static Method method[];
	public static Method capturescreenShot_method;

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		keywords = new Keywords();
		method = keywords.getClass().getMethods();
		for (Method a : method) {
			// System.out.println(a);
		}
		// System.out.println(method[2]);
		System.out.println(method.length);

		capturescreenShot_method = keywords.getClass().getMethod("captureScreenshot", String.class, String.class);
		System.out.println(capturescreenShot_method.invoke(keywords, "",""));
		System.out.println(capturescreenShot_method);

		method[2].invoke(keywords, "aa", "");
	}
}
