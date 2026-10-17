package org.syntax;
import java.io.*;
import java.nio.file.Files;
import java.util.*;
public class Error {
	private void compile()
	{
		//complie time
//		string a = "sum";
		//system.out.println(a+10/2);
//		List<int> a= new ArrayLis<>();
	}
	private void runtime() {
//		Arithmetic excep
		System.out.println(10/0);
	}	
	private void nulll()
	{
		//null pointer exception
//		Set<Integer> a = new TreeSet<>();
//		a.add(10);
//		a.add(20);
//		a.add(null);
		
//		Map<Integer,String> a = new TreeMap<>();
//		a.put(1, "a");
//		a.put(2, "b");
//		a.put(null,"c");
//		a.put(4, "g") ;
//		System.out.println(a);
		
//		Map<Integer,String> a = new Hashtable<>();
//		a.put(1, "a");
//		a.put(2, "b");
//		a.put(null,"f");
//		a.put(3, "w") ;
//		System.out.println(a);
		
//		String a = null;
//		System.out.println(a.charAt(0));
//		
	}
	private void index() {
		//IndexOutOfBoundsException
		List<Integer>a = new ArrayList<>();
		a.add(10);
		a.add(30);
		a.add(40);
		System.out.println(a.get(7));
	}
	private void StrExcept() {
		// StringIndexOutBoundsException
		String a = "Java";
		System.out.println(a.charAt(5));
	}
	private void array()
	{
		//ArrayIndexOutOfBoundsException
		int[]a = {1,2,3,4};
		System.out.println(a[6]);
	}
	private void format() {
		//NumberFormatException:
		String a = "123lm";
		int b =Integer.parseInt(a);
		System.out.println(b+1);
	}
	private void input() {
		//InputMismatchException
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		System.out.println(b);
		a.close();
		//source and target are not in same format
	}
	private void cast()
	{
		//ClassCastException
		Set b = new TreeSet<>();
		b.add(10);
		b.add(20.3);
		b.add("JAVA");
		b.add(true);
		b.add('a');
		System.out.println(b);
	}
	
	private void io() throws FileNotFoundException
	{ //IO exception & FileNotFoundException
		File a = new File("D:\\practice");
		
		Scanner b = new Scanner(a);
		while(b.hasNextLine()){
			String c = b.nextLine();
			System.out.println(c);
		}
		b.close();
	}
	public static void main(String[] args) throws IOException{
		Error a = new Error();
//		a.compile();
//		a.runtime();
//		a.nulll();
//		a.StrExcept();
//		a.index();
//		a.array();
//		a.format();
//		a.input();
//		a.cast();
//		a.io();
	}
}
