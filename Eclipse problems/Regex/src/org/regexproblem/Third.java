package org.regexproblem;

public class Third {
	public static void main(String[] args) {
		//only digits
		System.out.println("5".matches("\\d"));
		System.out.println("a".matches("\\d"));
		System.out.println("@".matches("\\d")+"\n");
		
		//non digits characters
		System.out.println("5".matches("\\D"));
		System.out.println("a".matches("\\D"));
		System.out.println("$".matches("\\D")+"\n");
		
		//letters,digits,underscore
		System.out.println("$".matches("\\w"));
		System.out.println("t".matches("\\w"));
		System.out.println("5".matches("\\w"));
		System.out.println("_".matches("\\w"));
		System.out.println("A".matches("\\w")+"\n");
		
		//special char
		System.out.println("$".matches("\\W"));
		System.out.println("&".matches("\\W"));
		System.out.println("a".matches("\\W"));
		System.out.println("7".matches("\\W"));
		System.out.println("_".matches("\\W")+"\n");
		
		//only space and tab space
		System.out.println(" ".matches("\\s"));
		System.out.println("\t".matches("\\s"));
		System.out.println("$".matches("\\s"));
		System.out.println("a".matches("\\s"));
		System.out.println("7".matches("\\s")+"\n");
		
		//only characters
		System.out.println("$".matches("\\S"));
		System.out.println(" ".matches("\\S"));
		System.out.println("A".matches("\\S"));
		System.out.println("5".matches("\\S"));
		System.out.println("_".matches("\\S")+"\n");
		
		
		String a = "Sava_123@gmail.com";
		boolean m = a.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
		System.out.println(m);
		
		String d="1234509876";
		boolean m1 = d.matches("\\d{10}");
		System.out.println(m1);
		
		String c ="servin@622";
		boolean matches = c.matches("^(?=.*[A-z])(?=.*[a-z])(?=.*\\d)(?=.*[@#!%$*&]).{8,}$");
		System.out.println(matches);
	}
}
