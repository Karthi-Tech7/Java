package org.comparartorpro;
import java.util.*;
public class Run {
	public static void main(String[] args) {
		Forms f = new Forms();
		f.setName("karthi");
		f.setRole(32);
		f.setBenchNo(7);
		
		Forms f1 = new Forms();
		f1.setName("bhava");
		f1.setRole(12);
		f1.setBenchNo(10);
		
		Forms f2 = new Forms();
		f2.setName("girini");
		f2.setRole(16);
		f2.setBenchNo(6);
		
//		
//		System.out.println(f1.getName()+"\n"+f1.getRole()+"\n"+f1.getBenchNo());
//		System.out.println(f2.getName()+"\n"+f2.getRole()+"\n"+f2.getBenchNo());
		
		List<Forms> l=new ArrayList<>();
		l.add(f);
		l.add(f1);
		l.add(f2);
//		
//		NameCom n = new NameCom();
//		Collections.sort(l,n);
//		
//		for(Forms fi:l)
//		{
//			System.out.println("Name:"+fi.getName()+"\n"+"Role:"+fi.getRole()+"\n"+"BenchNo:"+fi.getBenchNo());
//		}
		
//		AgeCom ag = new AgeCom();
//		Collections.sort(l,ag);
//		
//		for(Forms fi:l)
//		{
//			System.out.println("Name:"+fi.getName()+"\n"+"Role:"+fi.getRole()+"\n"+"BenchNo:"+fi.getBenchNo());
//		}
		
		BenchNo b = new BenchNo();
		Collections.sort(l,b);
		
		for(Forms fi:l)
		{
			System.out.println("Name:"+fi.getName()+"\n"+"Role:"+fi.getRole()+"\n"+"BenchNo:"+fi.getBenchNo());
		}
		
	}
}
