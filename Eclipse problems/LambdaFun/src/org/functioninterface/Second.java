package org.functioninterface;

public class Second {
	public static void main(String[] args) {
//		First f= ()-> System.out.println("1234");
//		f.first();
//		First f2=(second)-> System.out.println(second);
//		f2.second(70);
//		First f3=(a,b)->System.out.println(a+b);
//		f3.third(10,20);
		First f4=(a,b)->{
			System.out.println(a+b);
	        return a*b;
		};
		int r=f4.forth(7, 2);
		System.out.println(r);
	}
}
