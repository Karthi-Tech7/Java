package org.p1;

public class Dog extends Animal {
	public static void main(String[] args) {
		Dog a = new Dog();
		a.eat();
		a.bark();
	}
	public void bark()
	{
		System.out.println("Dog is barking");
	}

}
