package org.encapsulation;

public class Bank {
	private String name;
	private long accnum;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		if(name.equals("ram")) {
			this.name = "Balance:7000";
		}else if(name.equals("karthi")) {
			this.name = "Balance:5000";
		}else if(name.equals("dhanush"))
		{
			this.name = "Balance=10000";
		}else if(name.equals("nagulan"))
		{
			this.name="Balance:1 lakh";
		}else {
			this.name = "no match user name";
		}
	}
	public long getAccount()
	{
		return accnum;
	}
	public void setAccount(int accnum)
	{
		if(accnum == 9876543)
		{
			this.accnum = 1;
		}else if(accnum == 123456789) {
			this.accnum = 2; 
		}else if(accnum == 678912345) {
			this.accnum =3;
		}else if(accnum == 543216789) {
			this.accnum =4;
		}else {
			this.accnum = 0;
		}
	}
	
}
