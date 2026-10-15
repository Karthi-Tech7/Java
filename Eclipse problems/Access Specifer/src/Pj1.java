
public class Pj1 extends Default{
	
//	public void value() {
//		System.out.println("value private :"+a);->private method
	
//	public void name() {
//		int a1 =50;
//		int a2 = 50;
//		System.out.println("pubic value :"+(a1+a2));
//		
//	}

//	protected void age() {
//		String a = "not Allow";
//		System.out.println("age value below 18:"+a);
//		super.age();
//	}
	@Override
	void vela() {
		String a ="S90";
		System.out.println("another bus number:"+a);
		super.vela();
	}
	

	
	public static void main(String[] args) {
		Pj1 c = new Pj1();
		c.vela();
//		c.age();
//		c.name();
//		c.value();
	}

}
