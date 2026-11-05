package org.regexproblem;

public class Sceond {
	public static void main(String[] args) {
		//compare email
		String email = "Karthi123@gmail.com";
		boolean matches = email.matches("[A-Za-z0-9]+@[a-z]+\\.[a-z]{2,}");
		System.out.println(matches);
		
		//phone comp
		String ph="0123456789";
		boolean matches2 = ph.matches("[0-9]{10}");
		System.out.println(matches2);
		
		//password comp
		String pass = "Karthi@123";
		boolean matches3 = pass.matches("[A-Za-z@0-9]{6,12}");
		System.out.println(matches3);
	}
}
