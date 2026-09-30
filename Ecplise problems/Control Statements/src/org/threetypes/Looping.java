package org.threetypes;

public class Looping {
	public void forloop(int a,int b)
	{
		//for and nested forloop
		for(int i=a;i<=b;i++) {
			int count = 1;
			
			for(int j=a;j<=b;j++)
			{
				System.out.println("number:"+count);
				count = count+i;
			}
		}
		//while and do while
		
	}
	public void whiledo(int a,int b)
	{
		int i = a;
		
		int c = 1;
		while(i<=b)
		{
			System.out.println("count:"+c);
			c =c+i;
			i++;
		}
		
	}
	void dowhile(int a,int b)
	{
		int i =a;
		int s = 1;
		do {
			System.out.println("set:"+s);
			s = s+i;
			i++;
		}while(i<=b);
		
	}
	public static void main(String[] args) {
		Looping a = new Looping();
		a.forloop(1, 2);
		a.whiledo(1,2);
		a.dowhile(1, 2);
	}

}
