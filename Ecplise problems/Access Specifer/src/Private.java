public class Private
{
	private int a =30;
	
	public void name()
	{
		System.out.println("Private variable value:"+a);
	}
	public static void main(String[] args) {
		Private b = new Private();
		b.name();
		
	}
	
}