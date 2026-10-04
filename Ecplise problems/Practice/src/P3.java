
public class P3 {
	public void calculator(char op, int b,int a)
	{
		System.out.println("Calculator:");
		switch(op)
		{
		case'+':{
			System.out.println("Addition value:"+(a+b));
		}
		case'-':{
			System.out.println("Subraction value:"+(a-b));
		}
		case'*':{
			System.out.println("Multiplication value:"+(a*b));
		}
		case'/':{
			System.out.println("Division value:"+(a/b));
			break;
		}
		default:{
			System.out.println("invalid operator");
		}
		}
		System.out.println("sum of total:"+((a+b)+(a-b)+(a*b)+(a/b)));
	}
	public static void main(String[] args) {
		P3 a = new P3();
		a.calculator('+',10,20);
	}

}
