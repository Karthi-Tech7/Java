package org.moreproiblem;

import java.util.function.Predicate;
public class Demo1 {
	public static void main(String[] args) {
		
//		Predicate<Integer> i = ex->(ex%2==0);
//		boolean test = i.test(10);
//		System.out.println(test);
//		
//		Predicate<Integer> j = xe->(xe%2==0);
//		System.out.println(j.test(7));
		
		//list
//		Predicate<List<String>> ls = c->(c.contains("Java")); 
//		List<String> ss = new ArrayList<>();
//		ss.add("python");
//		ss.add("C Sharp");
//		ss.add("Java");
//		System.out.println(ls.test(ss));
//		
//		//map
//		Map<String,Integer> m = new LinkedHashMap<>();
//		m.put("Front",40);
//		m.put("Back", 40);
//		m.put("Full", 20);
//		
//		Set<String> se =m.keySet();	
//		Predicate<String> ps = ne->(ne.equals("Full"));
//		for(String fs:se)
//		{
//			System.out.println(ps.test(fs));
//		}
		
		//array
		int [] ar = {1,2,3,4,5,6,7,8,9,10};
		Predicate<Integer> pi = od->(od%2==0);
		for(int i=0;i<ar.length;i++)
		{
//			System.out.println(pi.test(ar[i]));
			if(pi.test(ar[i]))
			{
				System.out.println(ar[i]);
			}
		}
	}
}
