package org.p2;

public class Child extends Parent{
	public static void main(String[] args) {
		Child a = new Child();
		a.gP();
		a.p();
		a.ch();
	}
	public void ch()
	{
		System.out.println("child get the land");
	}

}
