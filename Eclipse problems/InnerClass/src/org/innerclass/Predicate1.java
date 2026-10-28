package org.innerclass;

import java.util.function.Predicate;

public class Predicate1 {
	public static void main(String[] args) {
		Predicate<Float> p= age->{
			if(age!=7.7) {
				return true;
			}else {
				return false;
			}
		};
		boolean test = p.test((float) 7.7);
		System.out.println(test);
	}
}
