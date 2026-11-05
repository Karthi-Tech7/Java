package org.threadproblem;

class C{
	synchronized public void sec(int a) {
		for(int i=1;i<5;i++)
		{
			System.out.println("cinnamon:"+a*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Second {
	public static void main(String[] args) throws InterruptedException {
		C c= new C();
		
		Thread t = new Thread(){
			public void run() {
				c.sec(2);
			}
		};
		
		Thread t1 = new Thread() {
			public void run() {
				c.sec(5);
			}
		};
		t.start();
		t1.start();
		
		
		t1.join();
	}
}
