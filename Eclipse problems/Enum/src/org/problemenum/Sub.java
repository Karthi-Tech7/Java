package org.problemenum;

enum Subject{
	RED,YELLOW,GREEN
}
public class Sub {
	public static void main(String[] args) {
		Subject yellow = Subject.YELLOW;
		System.out.println("enum is class stored in java.lang pre-default package:"+yellow.getClass().getSuperclass()+"\n");
		System.out.println("enum normal obje call:"+yellow);
		
		//ordinal();
		System.out.println("\n"+"this is a ordinal enum:"+yellow.ordinal()+"\n");
		
		//values();
		Subject[] values = Subject.values();
		for(Subject a:values)
		{
			System.out.println("this is a values enum:"+a);
		}
		
		//valueof
		Subject valueOf = Subject.valueOf("GREEN");
		System.out.println("\n"+"this is a valueOf enum:"+valueOf);
		
	}
}
