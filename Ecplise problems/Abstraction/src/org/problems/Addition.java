package org.problems;

public class Addition extends Operation{
//	public void calculate()
//	{
//		int a =10;
//		int b =20;
//		System.out.println("sum of total :"+(a+b));
//	}
	public static void main(String[] args) {
		Addition c = new Addition();
//		int a =10;
//		int b =20;
		
		c.calculate(10,20);
	}
	@Override
	public void calculate(int a, int b) {
		
		System.out.println("sumof tot:"+(a+b));
		
	}

}
