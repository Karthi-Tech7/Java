package org.moreproiblem;

import java.util.function.Predicate;

public class Demo2 {
	public static void me(Predicate<Integer> f2,int[] array2)
	{
		for(int i=0;i<array2.length;i++)
		{
			boolean test = f2.test(array2[i]);
//			System.out.println(test);
			
			if(test)
			{
				System.out.println(array2[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		Predicate<Integer> p1 = f1->(f1%2!=0);
		Predicate<Integer> p2 = f1->(f1>=5);
		
//		me(pt,array1);
		me(p1.and(p2),array1);
//		me(p1.or(p2),array1);
		me(p1.negate(),array1);
		
	}
}
