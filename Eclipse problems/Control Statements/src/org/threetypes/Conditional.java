package org.threetypes;

public class Conditional {
	
	public void ifelse(int n) {
		if(n%2==0)
		{
			System.out.println("Accept");
		}
		else {
			System.out.println("decline");
		}
		
	}
	//else-if and nested if
	void elseif(int n)
	{
		if(n%2!=0)
		{
		     System.out.println("Accept");
		     if(n>=n)
		     {
		    	 System.out.println("good");
		     }
		}
		else if(n>=6 && n<=7)
		{
			System.out.println("granted");
		}
		else if(n>13 && n<=20)
		{
			System.out.println("granted");
		}
	}
	public static void main(String[] args) {
		Conditional a= new Conditional();
		a.ifelse(4);
		a.elseif(6);
	}
	

}
