package com.LambdaExpressions;

interface Drawable {
	public void draw();
}

interface Sayable {
	//public String say();

	public String say(String name);

}

public class JavatPoint_Drawable {
	public static void main(String[] args) {
		final int width = 10;

		// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();
/*		Sayable s = () -> {
			return "I have nothing to say.";
		};
		System.out.println(s.say());
*/	
		
		Sayable s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Sonoo"));

		Sayable s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Sonoo"));
	        
	        
	}
}