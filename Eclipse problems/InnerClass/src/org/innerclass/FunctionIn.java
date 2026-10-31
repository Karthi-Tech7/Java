package org.innerclass;

import java.util.*;
import java.util.function.Function;

public class FunctionIn {
	
	public static void p1(Function<Integer,Boolean> b1,int [] c2)
	{
		for(int i=1;i<c2.length;i++)
		{
			Boolean apply = b1.apply(i);
//			System.out.println(apply);
			if(apply)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
//		Function<Integer,Boolean> ib1 = a1->(a1>18);
//		Boolean apply = ib1.apply(15);
//		System.out.println(apply);
//		
//		Function<String,Character> ib2 = a2->(a2.charAt(0));
//		Character apply2= ib2.apply("Name");
//		System.out.println(apply2);
//		 
//		
//		Function<List<String>,Boolean> ib3 = a3->(a3.equals("Abs"));
//		List<String> li=new ArrayList<>();
//		li.add("Abb");
//		li.add("Abc");
//		li.add("Abd");
//		
//		Boolean apply3 = ib3.apply(li);
//		System.out.println(apply3);
		Function<Integer,Boolean> ib4 = a4->(a4%2==0);
		int [] c1 = {1,2,3,4,5,6,7,8,9,10};
		
//		for(int i=1;i<c1.length;i++)
//		{
//			Boolean apply4 = ib4.apply(i);
////			System.out.println(apply4);
////			if(apply4)
////			{
////				System.out.println(i);
////			}
//		}
		p1(ib4,c1);
		
		
		
	}
}
