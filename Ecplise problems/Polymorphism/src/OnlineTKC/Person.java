package OnlineTKC;

public class Person extends Counter{
	public void ticketDetail(String name )
	{
		System.out.println("person2 name:"+name);
		super.ticketDetail("Karthi");
		super.ticketDetail(1);
		super.ticketDetail("E1",(short)500);
		super.ticketDetail(536789382973L);
	}
	
	public void ticketDetail(int numb)
	{
		System.out.println("numbe2 ticket lock:"+numb);
	}
    public void ticketDetail(String setNo,short price)
	{
		System.out.println("ticker2 set no:"+setNo+"\n"+"ticket2 price:"+price);
	}
	public void ticketDetail(long tkNum)
	{
		System.out.println("ticket2 number:"+tkNum);
	}
	public static void main(String[] args) {
		Person a = new Person();
		a.ticketDetail("Dhanush");
		a.ticketDetail(2);
		a.ticketDetail("E2",(short)500);
		a.ticketDetail(56479847538L);
		
		System.out.println("Total tickets:2");
		
	}

}
