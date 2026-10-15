package org.problems;

public class Cat extends Animal{
	public void sound(String name)
	{
		System.out.println("CAt say :"+name);
	}
	public static void main(String[] args) {
		Cat a = new Cat();
		a.sound("Meow");
		a.info(32);
	}
}
