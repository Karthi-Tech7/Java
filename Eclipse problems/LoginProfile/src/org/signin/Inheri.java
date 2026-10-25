package org.signin;

import java.io.IOException;
import java.util.*;
public class Inheri {
	public static void main(String[] args) throws IOException {
		Status s = new Status();
		s.dataBase();
		s.setName("karthi");
		s.setUserName("karthi_2");
		s.setEmail("karthi@gmail");
		s.setPassword(0);
		Status t = new Status();
		t.dataBase();
		t.setName("dhanush");
		t.setUserName("dhan_12");
		t.setEmail("dhanush@gmail");
		t.setPassword(0);
		Status u = new Status();
		u.dataBase();
		u.setName("nagulan");
		u.setUserName("nagul_7");
		u.setEmail("nagulan@gmail");
		u.setPassword(0);
		
//		String name = s.getName();
//		System.out.println(name);
//		String userName = s.getUserName();
//		System.out.println(userName);
//		String email = s.getEmail();
//		System.out.println(email);
//		Integer password = s.getPassword();
//		System.out.println(password);
//		collection to inherit
		List <Status>li = new LinkedList<>();
		li.add(s);
		li.add(t);
		li.add(u);
		
		Collections.sort(li);
		
		for(Status st:li)
		{
			System.out.println("\n"+st.getName()+"\n"+st.getUserName()+"\n"+st.getEmail()+"\n"+st.getPassword());
		}
		
	}

}
