package org.functioninterface;

public class Return {
	public int r1(int a,int b)
	{
		System.out.println(a+b);
		return a*b;
	}
	private void r2(int a) {
		System.out.println(a*7);
	}
	public static void main(String[] args) {
		Return rn =new Return();
		int ad =rn.r1(10, 20);
		System.out.println(ad);
		rn.r2(5);
		
		
	}
}
