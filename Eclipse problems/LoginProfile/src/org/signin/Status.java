package org.signin;
import java.io.*;
import java.util.*;
import org.apache.commons.io.FileUtils;
public class Status {
	private String name;
	private String userName;
	private String email;
	private String Password;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(name.equals("karthi")){
			this.name = "valid name";
		}
		if(name.equals("dhanush")){
			this.name = "valid name";
		}
		if(name.equals("nagulan")){
			this.name = "valid name";
		}
		
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public static void main(String[] args) throws IOException {
		Map<String,Integer> m = new LinkedHashMap<>();
		File f = new File("C:\\Users\\acer\\Documents\\Eng\\data.txt");
		List<String> rd = FileUtils.readLines(f);
		for(int i=0;i<rd.size();i++)
		{
			String pv = rd.get(i);
			String[] sp = pv.split(",");
			String name = sp[0];
			String pas= sp[3];
			int convert = Integer.parseInt(pas);
			m.put(name, convert);
		}
		System.out.println(m);
	}
}
