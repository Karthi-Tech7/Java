package org.threetypes;

public class Jumping {
	//break
	void breakp(int a,int b)
	{
		
		for(int i=a;i<=b;i++)
		{
			
			if(i==7)
			{
			  break;
			}
			System.out.println(i);
		}
		
		System.out.println("fun stop by equal value if condi using break key :");
	}
	//continue
	void con(int a,int b)
	{
		
		for(int i=a;i<=b;i++)
		{
			
			if(i==7)
			{
			  continue;
			}
			System.out.println(i);
		}
		
		System.out.println("fun skip the equal value in if then show on out balance values by using continue key:");
	}
	//system.exit()
	void sye(int a,int b)
	{
		
		for(int i=a;i<=b;i++)
		{
			
			if(i==7)
			{
			  System.exit(i);
			}
			System.out.println(i);
		}
		
		System.out.println("fun exit from equal on total class will be stop using system.exit(); key:");
	}
	public static void main(String[] args) {
		Jumping a = new Jumping();
		a.breakp(1, 10);
		a.con(1, 10);
		a.sye(1, 10);
	}

}
