package org.regexproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
	public static void main(String[] args) {
		Pattern compile = Pattern.compile("in");
		Matcher matcher = compile.matcher("The programming in java");
		boolean find = matcher.find();
		System.out.println(find);
		
		//short code
		System.out.println("java in pro".matches("java"));
		
		//dot
		System.out.println("The dot:"+"ab".matches("a.b"));
		System.out.println("The dot:"+"aab".matches("a.b"));
		System.out.println("The dot:"+"a1b".matches("a.b")+"\n");
		
		//star
		System.out.println("The star:"+"a".matches("ab*"));
		System.out.println("The star:"+"ab".matches("ab*"));
		System.out.println("The star:"+"abb".matches("ab*")+"\n");
		
		//plus
		System.out.println("The plus:"+"a".matches("ab+"));
		System.out.println("The plus:"+"ab".matches("ab+"));
		System.out.println("The plus:"+"abb".matches("ab+")+"\n");
		
		//question mark
		System.out.println("The question mark:"+"color".matches("colou?r"));
		System.out.println("The question mark:"+"colour".matches("colou?r")+"\n");
		
		//character classes
		System.out.println("The Charactor classes:"+"a".matches("[abc]"));
		System.out.println("The Charactor classes:"+"b".matches("[abc]"));
		System.out.println("The Charactor classes:"+"1".matches("[abc]")+"\n");
		
		System.out.println("The Charactor classes:"+"a".matches("[a-z]"));
		System.out.println("The Charactor classes:"+"A".matches("[abc]"));
		System.out.println("The Charactor classes:"+"1".matches("[abc]")+"\n");
		
		System.out.println("The Charactor classes:"+"a".matches("[A-Z]"));
		System.out.println("The Charactor classes:"+"1".matches("[A-Z]"));
		System.out.println("The Charactor classes:"+"A".matches("[A-Z]")+"\n");
		
		System.out.println("The Charactor classes:"+"10".matches("[0-9]"));
		System.out.println("The Charactor classes:"+"@".matches("[0-9]"));
		System.out.println("The Charactor classes:"+"7".matches("[0-9]")+"\n");
		
		System.out.println("The Charactor classes:"+"1234".matches("[0-9]{5}"));
		System.out.println("The Charactor classes:"+"1234567".matches("[0-9]{5,}"));
		System.out.println("The Charactor classes:"+"12345678910".matches("[0-9]{5,8}"));
		
	}
}
