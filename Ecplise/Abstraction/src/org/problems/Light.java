package org.problems;

public class Light extends Application{
	public void turnOn(String n1)
	{
		System.out.println("Light is turn:"+n1);
	}
	public static void main(String[] args) {
		Light b = new Light();
		b.turnOn("on");
	}

}
