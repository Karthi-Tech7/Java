package org.innerclass;

import java.util.function.Function;
import java.util.*;
public class ForEach {
	private void m1(String a1) {
		System.out.println("Function default str:"+a1.equalsIgnoreCase("max"));
		
	}
	
	private static void m2(int b) {
		System.out.println("Static funin:"+(b/6));
	}
	private ForEach(int c) {
		System.out.println("Constructorin function interface:"+(c*2));

	}
	public static void main(String[] args) {		 
//		List<String> l1= new ArrayList<>();
//		l1.add("min");
//		l1.add("length");
//		l1.add("max");
//		
//		ForEach forEach = new ForEach();
//		l1.forEach(forEach::m1);
		
		List<Integer> l2=new ArrayList<>();
		l2.add(45);
		l2.add(25);
		l2.add(6);
		
		l2.forEach(ForEach::m2);
		
		List<Integer> l3 = new ArrayList<>();
		l3.add(1);
		l3.add(2);
		l3.add(3);
		
		l3.forEach(ForEach::new);
	}
}
