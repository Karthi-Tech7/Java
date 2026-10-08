import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class SetPro {
	static void hashSet()
	{
		Set<Integer> value = new HashSet<>();
		value.add(30);
		value.add(20);
		value.add(70);
		value.add(34);
		value.add(15);
		System.out.println("1. all elements in Set: "+value);
		System.out.println("2. Set size: "+value.size());
		boolean check = value.contains(20);
		System.out.println("3. check the elements 20 in set: "+check);
		System.out.println("4. remove 34 in element: "+((boolean)value.remove(34)));
		System.out.println("5. balance elements: "+value);
		System.out.println("6. check set is empty: "+((boolean)value.isEmpty()));
		System.out.println("7. recheck value in set: "+value);
		value.clear();
		System.out.println("8. clear all elements in set: "+(value));
		value.add(7);
		value.add(7);
		System.out.println("9. add two 7 but set not allow duplicate value: "+value);
		
		Set<String> name = new HashSet<>();
		name.add("john");
		name.add("karthi");
		name.add("rose");
		name.add("dhanush");
		name.add("vishwa");
		System.out.println("10. Class students name: "+name+"\n   Remove rose in boys list");
		name.remove("rose");
		System.out.println("11. Balance student name list: "+name);
	}
	static void compare()
	{
		System.out.println(" ");
		Set<Integer> com = new HashSet<>();
		com.add(50);
		com.add(20);
		com.add(90);
		com.add(24);
		com.add(65);
		System.out.println("1.compare set: "+com);
		int lg = 0;
		int sm = 0;
		int sum = 0;
		int even = 0;
		int odd =0;
		for(int a:com)
		{
			sum+=a;
			if(a>lg)
			{
				lg = a;
			}
			if(a<sm)
			{
				sm = a;
				
			}
			if(a%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("2.largest values: "+lg);
		System.out.println("3.smallest value: "+sm);
		System.out.println("4.sum of total: "+sum);
		System.out.println("5.total even value: "+even);
		System.out.println("6.total odd value "+odd);
	}
	static void convert()
	{
		List<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		System.out.println("\n1.list contining duplicate into a set: "+list);
		Set<Integer> set = new TreeSet<>();
//		System.out.println(set);
		set.addAll(list);
		System.out.println("2.addall list value then set remove duplicate value: "+set);
		list.retainAll(set);
		System.out.println("3.unqiue elements in list: "+list);
		Set<Integer> op = new TreeSet<>(Collections.reverseOrder());
		op.addAll(list);
		System.out.println("4. elements in descending order: " + op);
		Set<Integer> a = new HashSet<>(list);
		System.out.println("5.HashSet: "+a);
		Set<Integer> b = new LinkedHashSet<>(list);
		System.out.println("6.LinkedHashSet: "+b);
		Set<Integer> c = new TreeSet<>(list);
		System.out.println("7.TreeSet"+c);
	}
	static void last()
	{
	    Set<Integer> a = new HashSet<>();
	    a.add(10);
	    a.add(20);
	    a.add(30);

	    Set<Integer> b = new LinkedHashSet<>();
	    b.add(30);
	    b.add(40);
	    b.add(50);

	   
	    Set<Integer> union = new HashSet<>(a);
	    union.addAll(b);
	    System.out.println("\n1. add union of two sets: " + union);

	    
	    Set<Integer> intersection = new HashSet<>(a);
	    intersection.retainAll(b);
	    System.out.println("2. intersection of two Sets: " + intersection);
	    
	    
	    Set<Integer> first = new HashSet<>(a);
	    first.removeAll(b);
	    System.out.println("3. elements present in Set1 but not Set2: " + first);

	    
	    Set<Integer> second = new HashSet<>(b);
	    second.removeAll(a);
	    System.out.println("4. elements present in Set2 but not Set1: " + second);

	   
	    boolean eq = a.equals(b);
	    System.out.println("5. whether two Sets are equal: " + eq);

	    
	    boolean sub = a.containsAll(b);
	    System.out.println("6. whether Set2 is a subset of Set1: " + sub);
	}
	public static void main(String[] args) {
		hashSet();
		compare();
		convert();
		last();
	}
}
