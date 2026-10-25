package org.signin;
import java.io.*;
import java.util.*;
import org.apache.commons.io.FileUtils;
public class Status implements Comparable<Status>{
	private String name;
	private String userName;
	private String email;
	private Integer password;
	Map<String,Integer>m;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(name.equals("karthi")){
			this.name = "valid name";
		}
		else if(name.equals("dhanush")){
			this.name = "valid name";
		}
		else if(name.equals("nagulan")){
			this.name = "valid name";
		}
		
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		if(userName.equals("karthi_2"))
		{
			this.userName="valid userName karthi_2";
		}
		else if(userName.equals("dhan_12"))
		{
			this.userName="valid userName dhan_12";
		}
		else if(userName.equals("nagul_7"))
		{
			this.userName="valid userName nagul_7";
		}
		else {
			this.userName = "Invalid userName";
		}
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		if(email.equals("karthi@gmail"))
		{
			this.email = "valid email";
		}
		else if(email.equals("dhanush@gmail"))
		{
			this.email = "valid email";
		}
		else if(email.equals("nagulan@gmail"))
		{
			this.email = "valid email";
		}
		else {
			this.email = "Invalid email";
		}
	}


	public Integer getPassword() {
		return password;
	}


	public void setPassword(Integer password) {
		if(userName.equals("valid userName karthi_2"))
		{
			Integer pass = m.get("karthi");
			this.password = pass;
		}
		else if(userName.equals("valid userName dhan_12"))
		{
			Integer pass = m.get("dhanush");
			this.password = pass; 
		}
		else if(userName.equals("valid userName nagul_7"))
		{
			Integer pass = m.get("nagulan");
			this.password = pass; 
		}
		else {
			this.password = 0;
		}
	}


	public void dataBase () throws IOException {
		 m = new LinkedHashMap<>();
		File f = new File("C:\\Users\\acer\\Documents\\Eng\\data.txt");
		List<String> rd = FileUtils.readLines(f,"UTF-8");
		for(int i=0;i<rd.size();i++)
		{
			String pv = rd.get(i);
			String[] sp = pv.split(",");
			String name = sp[0];
			String pas= sp[3];
			int convert = Integer.parseInt(pas);
			m.put(name, convert);
		}
//		System.out.println(m);
	}
	@Override
    public int compareTo(Status o) {
        // Ascending Order (Chinnathula irunthu perusu):
        if (this.password > o.password) {
            return -1;
        } else if (this.password < o.password) {
            return 1;
        } else {
            return 0;
        }
    }
}
