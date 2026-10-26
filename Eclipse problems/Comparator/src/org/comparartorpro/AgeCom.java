package org.comparartorpro;
import java.util.*;
public class AgeCom implements Comparator<Forms>{

	@Override
	public int compare(Forms o1, Forms o2) {
		if(o1.getRole() < o2.getRole())
		{
			return -1;
		}else if(o1.getRole() > o2.getRole())
		{
			return 1;
		}
		else {
			return 0;
		}
	}

}
