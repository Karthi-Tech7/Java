package org.singletonpro;
class Single{
	private static Single single;
	private Single() {
		System.out.println("Single api Start:");
	}
	public static Single getValue() {
		if(single==null)
		{
			single = new Single();
			return single;
		}
		else {
			return single;
		}
	}
	public void show(String deta) {
		System.out.println(deta+" is show the single value");
	}
}
public class First {
	public static void main(String[] args) {
		Single v1 = Single.getValue();
		v1.show("20");
		Single v2 = Single.getValue();
		v2.show("70");
		Single v3 = Single.getValue();
		v3.show("100");
		
		System.out.println("\nThe same object will be returned");
		System.out.println(v1==v2);
		System.out.println(v2==v3);
		System.out.println(v3==v1);
	}
}
