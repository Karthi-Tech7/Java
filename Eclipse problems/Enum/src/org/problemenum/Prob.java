package org.problemenum;

enum Value{
	POWER(10),ANGLE(20),VALUE;
	//ENUM constructor
	private int sum;
	private Value() {
		System.out.println("This is a default constructor");
	}
	private Value(int a) {
		sum =a;
	}
	public int getSum() {
		return sum;
	}
}
public class Prob {
	public static void main(String[] args) {
		Value angle = Value.ANGLE;
		System.out.println(angle.getSum());
	}
}
