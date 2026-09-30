package org.problems;

public class Subcl implements Circle,Rectangle{
	public void d1(String name1)
	{
		System.out.println("Drawing :"+name1);
	}
	public void d2(String name2) {
		System.out.println("Drawing"+name2);
	}
	public static void main(String[] args) {
		Subcl a = new Subcl();
		a.d1("Circle");
		a.d2("Rectangle");
	}
	

}
