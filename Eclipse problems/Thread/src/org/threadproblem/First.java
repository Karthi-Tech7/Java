package org.threadproblem;

class A extends Thread{
	public void run() {
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread A class");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread B class");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class First {
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		B b = new B();
		
		a.start();
		b.start();
		
		if(a.isAlive()) {
			System.out.println("Still have life");
		}
		
		a.setPriority(7);
		b.setPriority(5);
		
		a.join();
		b.join();
		
		if(a.isAlive()) {
			System.out.println("still have life");
		}
		
		System.out.println("Hello world");
	}
}
