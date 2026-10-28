package org.innerclass;

public class SubInt implements InterStDe{

	@Override
	public void name() {
		System.out.println("this is abstract method in interface and after java 8 they introducet"
				+ " static and non static in interface and also create main method in interface");
	}
	
	public static void main(String[] args) {
		SubInt sb = new SubInt();
		sb.name();
		InterStDe.age();
		sb.num();
	}
}
