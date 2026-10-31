package org.innerclass;

import java.util.function.Consumer;
import java.util.*;
public class ConsumerIn {
	public static void main(String[] args) {
		Consumer<String> cs1 = a1->System.out.println(a1.toUpperCase());
		cs1.accept("nagulan");
		
		Consumer<String> cs2=a2->System.out.println(a2.equals("Am"));
		List<String> l = new ArrayList<>();
		l.add("Nm");
		l.add("Pm");
		l.add("Am");
		
		l.forEach(cs2);
		
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(70);
		
		li.forEach(a3->System.out.println(a3%2));
		
		
	}
}
