package org.comparartorpro;
import java.util.*;
public class NameCom implements Comparator<Forms>{

	@Override
	public int compare(Forms arg0, Forms arg1) {
		if(arg0.getName().charAt(0) < arg1.getName().charAt(0))
		{
			return -1;
		}else if(arg0.getName().charAt(0) > arg1.getName().charAt(0))
		{
			return 1;
		}else {
			return 0;
		}
	}

}
