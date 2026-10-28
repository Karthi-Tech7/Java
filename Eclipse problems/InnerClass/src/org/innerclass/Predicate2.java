package org.innerclass;

import java.util.function.Predicate;

public class Predicate2 {
	public static void main(String[] args) {
		Predicate<String> s = name->(name.equals("ram"));
		boolean b = s.test("ram");
		System.out.println(b);
	}
}
