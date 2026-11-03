package org.stream;
import java.util.*;
import java.util.function.Predicate;
public class TypStream {
	public static void main(String[] args) {
		//Array
		int []a= {1,2,3,4,5,6,7,8,9,10};
		//count-the number of value
		long count = Arrays.stream(a).count();
		System.out.println(count);
		
		//min();-find the min value
		OptionalInt min = Arrays.stream(a).min();
		System.out.println(min.getAsInt());
		
		//max();-find the max value
		OptionalInt max = Arrays.stream(a).max();
		System.out.println(max.getAsInt());
		
		//average to find the average
		OptionalDouble average = Arrays.stream(a).average();
		System.out.println(average.getAsDouble());
		
		//remove duplicate
		int[] b= {1,2,3,3,4,5,5,6,7,7,8,9,9,10};
		//3 methods iteration
		//1->Consumer<Integer> ci= a1->System.out.println(a1)
		//2-Arrays.stream(b).distinct().forEach(aq->System.out.println(aq));
		Arrays.stream(b).distinct().forEach(System.out::println);
		
		//sorted-to order number in ascending order
		int[] c= {3,4,1,2,6,5,7,8,10,9};
		Arrays.stream(c).sorted().forEach(System.out::println);
		
		//filter and map
		
		List<String> l=new ArrayList<>();
		l.add("java");
		l.add("css");
		l.add("html");
		l.add("python");
		l.add("javascript");
		
		//Predicate<String> p = li->(li.length()>4);
		//l.stream().filter(p).forEach(System.out::println);
		l.stream().filter(li->(li.length()>4)).forEach(System.out::println);
		
//		Predicate<String,String> p = ml->(ml.toUpperCase());
		l.stream().map(p->(p.toUpperCase())).forEach(System.out::println);
		
	}
	
	
}
