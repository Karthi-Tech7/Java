package org.innerclass;

import org.innerclass.Inner.Student;
import org.innerclass.Inner.Number;


public class Sub {
	public static void main(String[] args) {

		Inner i = new Inner();
		i.name();
		System.out.println(i.a);

//		non static
		Student s = i.new Student();
		s.age();
		System.out.println(s.b);
		
		//static
		Number n = new Inner.Number();
		n.num();
		System.out.println(n.a);
		
	}
}
