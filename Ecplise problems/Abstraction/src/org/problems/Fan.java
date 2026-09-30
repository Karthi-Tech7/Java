package org.problems;

public class Fan extends Application{
	public void turnOn(String n1)
	{
		System.out.println("FAn is turned:"+n1);
	}
	public static void main(String[] args) {
		Fan a = new Fan();
		a.turnOn("on");
	}

}
