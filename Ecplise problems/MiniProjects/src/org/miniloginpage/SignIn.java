package org.miniloginpage;
import java.util.Scanner;

public class SignIn {
	public void sign()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("           Sign In\n"+"Enter Your Email:");
		String a = sc.next();
		System.out.println(a);
		
		System.out.println("Enter Your Password:");
		int b = sc.nextInt();
		System.out.println(b);
		
		System.out.println("successful signin");
		
		System.out.println("      login   ");
		System.out.println("Enter Your Email:");
		String c = sc.next();
		
		if(c.equals(a))
		{
			System.out.println(" ");
		}
		else
		{
			System.out.println("Your Email is Incorrect\n"+"try again");
		}
		
		System.out.println("Enter Your Password:");
		int d = sc.nextInt();
		if(d == b)
		{
			System.out.println(" ");
		}
		else
		{
			System.out.println("Your Password is Incorrect\n"+"try again");
		}
		System.out.println("login successful");
		
		sc.close();
	}
	
	public static void main(String[] args) {
		SignIn set = new SignIn();
		set.sign();
		
}

	
}
