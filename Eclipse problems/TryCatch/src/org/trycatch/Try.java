package org.trycatch;

public class Try {
	private void one()
	{
		try {
			int a = 10;
			int b=0;
			System.out.println(a/b);
		}
//		catch(ArithmeticException e) {
//			System.out.println("the number is mismatch correct try again");
//		}
		catch(NullPointerException e)
		{
			System.out.println("this method return only null check the input ");
		}
//	     catch(Exception e) {
//			System.out.println("some exception is occure check the program");
//		}
		finally {
			System.out.println("always run");
		}
	}
	private void m()
	{
		System.out.println("java");
	}
	private void n()
	{
		System.out.println("programming");
	}
	public static void main(String[] args) {
//		Try t = new Try();
//		t.one();
//		t.m();
//		t.n();
		
		int age =15;
		if(age<18) {
			throw new ArithmeticException("this is throw exception");
		}
	}
}
	
