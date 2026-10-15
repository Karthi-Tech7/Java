
public class Rectangle extends Abstract{
	public void calculateArea()
	{
		int Length = 5;
	    int Width  = 4;
	    System.out.println("Length:"+Length);
	    System.out.println("Width:"+Width);
	    System.out.println("Rectangle:"+(Length*Width));
	    
	}
	@Override
	public void values(String a) {
		System.out.println("value not Acces:"+a);
		super.values("yes");
	}
	public static void main(String[] args) {
		Rectangle a = new Rectangle();
		a.calculateArea();
		a.values("no");
	}
	
}
