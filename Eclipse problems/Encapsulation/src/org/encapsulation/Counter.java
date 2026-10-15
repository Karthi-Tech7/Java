package org.encapsulation;
import java.util.*;
public class Counter {
	public static void main(String[] args) {
		Bank a = new Bank();
		a.setName("ram");
		a.setAccount(9876543);
		
		Bank b = new Bank();
		b.setName("karthi");
		b.setAccount(123456789);
		
		Bank c = new Bank();
		c.setName("dhanush");
		c.setAccount(678912345);
		
		Bank d = new Bank();
		d.setName("nagulan");
		d.setAccount(543216789);
		
		List<Bank> li = new LinkedList<>();
		li.add(a);
		li.add(b);
		li.add(c);
		li.add(d);
		
		for(Bank pr:li)
		{
			System.out.println(pr.getName());
			System.out.println(pr.getAccount());
		}
		
	}
}
