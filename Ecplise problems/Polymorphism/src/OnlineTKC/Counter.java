package OnlineTKC;

public class Counter {
	//method overloading
	public void ticketDetail(String name )
	{
		System.out.println("person1 name:"+name);
//	    this.ticketDetail("E1",(short)500);
//		this.ticketDetail(1);
//		this.ticketDetail(4536789382973l);
	}
	public void ticketDetail(int numb)
	{
		System.out.println("number1 ticket lock:"+numb);
	}
    public void ticketDetail(String setNo,short price)
	{
		System.out.println("ticker1 set no:"+setNo+"\n"+"ticket1 price:"+price);
	}
	public void ticketDetail(long tkNum)
	{
		System.out.println("ticket1 number:"+tkNum);
	}
//	public static void main(String[] args) {
//		Counter a = new Counter();
//		a.ticketDetail("karthi");
//	}
}
