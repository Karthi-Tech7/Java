package org.innerclass;

import java.util.function.Predicate;

public class Predicate3 {
	public static void main(String[] args) {
		Predicate<Integer> i = val->(val>20);
		boolean a = i.test(10);
		System.out.println(a);
		
		Predicate<String> s = str->(str.length()>5);
		boolean b = s.test("karthi");
		System.out.println(b);
	}
}
