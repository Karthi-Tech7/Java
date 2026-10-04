
public class P1 {
	public  void tallestPerson(int a,int b, int c,int d,int e,int f, int g)
	{
		if(a>b && a>c && a>d && a>e && a>f && a>g )
		{
			System.out.println("A is the tallest person");
		}
		else if(b>a && b>c && b>d && b>e && b>f && b>g)
		{
			System.out.println("B is the tallest person");
		}
		else if(c>a && c>b && c>d && c>e && c>f && c>g)
		{
			System.out.println("C is the tallest person");
		}
		else if(d>a && d>b && d>c && d>e && d>f && d>g)
		{
			System.out.println("D is the tallest person");
		}
		else if(e>a && e>b && e>c && e>d && e>f && e>g)
		{
			System.out.println("E is the tallest person");
		}
		else if(f>a && f>b && f>c && f>d && f>e && f>g)
		{
			System.out.println("F is the tallest person");
		}
		else if(g>a && g>b && g>c && g>d && g>e && g>f)
		{
			System.out.println("G is the tallest person");
		}
//		tallestPerson(140,130,120,122,111,121,123);
		
	}
	public static void main(String[] args) {
		P1 a = new P1();
		a.tallestPerson(134,143,156,180,145,145,165);
	}
	
}
