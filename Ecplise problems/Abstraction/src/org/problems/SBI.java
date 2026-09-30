package org.problems;

public class SBI extends Bank{
	public void getinterestRate(float rate)
	{
		System.out.println("Interest Rate:"+rate);
	}
	public static void main(String[] args) {
		
		SBI a = new SBI();
		a.getinterestRate(6.5f);
	}

}
