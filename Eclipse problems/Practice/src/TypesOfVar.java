public class TypesOfVar {
	private String brand = "Toyota";
	private String model = "Camry";
	private static String name = "ram";
	private static String schoolName = "Abcschool";
	private void calculateArea()
	{
		int length = 10;
		int breadth = 5;
		System.out.println("Area of "+(length*breadth));
	}
	private TypesOfVar()
	{
		int a = 10;
		System.out.println("Local variable");
		System.out.println("value:"+a);
	}
	private void local()
	{
		int principle = 40;
		int rate = 5;
		double time = principle*rate;
		System.out.println("simple interest is "+time);
	}
	public static void main(String[] args) {
		TypesOfVar a = new TypesOfVar();
		a.calculateArea();
		a.local();
		System.out.println("\nInstance Variable");
		System.out.println("Car Brand:"+a.brand+"\nCar Model:"+a.model);
		System.out.println("\nStatic variable");
		System.out.println("Student Name:"+name);
		System.out.println("Schoool Name:"+schoolName);
	}
}
