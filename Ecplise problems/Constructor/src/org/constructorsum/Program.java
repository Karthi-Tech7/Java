package org.constructorsum;

public class Program extends Another{
	public Program() {
		this(10,20);
		System.out.println("Object Create Successfully");
	}
	public Program(int v1,int v2)
	{
		this("karhti",21);
		System.out.println("Enter first value: "+v1+"\nEnter second value: "+v2+"\nsum of add: "+(v1+v2));
	}
	public Program(String name,int age)
	{
		super(5,4);
		System.out.println("Name: "+name+"\nAge: "+age);
	}
	public static void main(String[] args) {
		Program a = new Program();
		
	}
}
