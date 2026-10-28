package org.innerclass;

public interface InterStDe {
	public abstract void name();
	public static void age()
	{
		System.out.println("the value of interface inside the static method :"+(10+20));
	}
	public default void num()
	{
		System.out.println("default method inside the interface class :"+(7/14));
	}
	public static void main(String[] args) {
		System.out.println("And also create main method");
	}
}
