package org.innerclass;

public class Inner {
	int a = 70;
	public void name() {
		System.out.println("the name was nothing");
	}
	//inner class-non static
	class Student
	{
		int b = 40;
		public void age()
		{
			System.out.println("this is inner inner non static class method");
		}
	}
	//inner class-static
	static class Number
	{
		float a = 7.7f;
		public void num()
		{
			System.out.println("this is a static inner class ");
		}
	}
}
