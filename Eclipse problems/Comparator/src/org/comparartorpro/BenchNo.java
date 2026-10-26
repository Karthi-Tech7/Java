package org.comparartorpro;
import java.util.*;
public class BenchNo implements Comparator<Forms> {

	@Override
	public int compare(Forms o1, Forms o2) {
		if(o1.getBenchNo() < o2.getBenchNo())
		{
			return -1;
		}else if(o1.getBenchNo() > o2.getBenchNo())
		{
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
