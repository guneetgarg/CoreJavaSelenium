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
		System.out.println("****************** Method Name Present in Keyword class ******************");
		int i = 1;
		for (Method a : method) {
			System.out.println(i + "-> " + a);
			i++;
		}
		System.out.println("******************************************************************************");
		System.out.println("Total Number of Method in a class -> " + method.length);
		System.out.println("******************************************************************************");

		capturescreenShot_method = keywords.getClass().getMethod("captureScreenshot", String.class, String.class);
		System.out.println(capturescreenShot_method.invoke(keywords, "", ""));
		System.out.println(capturescreenShot_method);
		System.out.println("******************************************************************************");


		//accessing method using array..... order of array keep on changing... Method keybord do not preserve order
		System.out.println(method[1]);
		method[1].invoke(keywords);
	}
}
