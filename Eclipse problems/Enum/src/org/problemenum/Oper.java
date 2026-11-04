package org.problemenum;

enum Space{
	SOLARSYSTEM,STARS,ASTEROID
}
public class Oper {
	public static void main(String[] args) {
		Space as = Space.ASTEROID;
		//condition
		if(as==Space.SOLARSYSTEM)
		{
			System.out.println("our solar system");
		}
		else if(as==Space.STARS) {
			System.out.println("galaxy starts");
		}
		else if(as==Space.ASTEROID)
		{
			System.out.println("Space asteriods");
		}
		else {
			System.out.println("something is wrong");
		}
		
		//switch case
		switch(as) {
		case SOLARSYSTEM:{
			System.out.println("more then asteriod 5m ");
			break;
		}
		case STARS:{
			System.out.println("no more the 7tri asteroid in space");
			break;
		}
		case ASTEROID:{
			System.out.println("n number of asteroid in sapce");
			break;
		}
		default:{
			System.out.println("somthing is wrrong");
			
		}
		}
		
	}
}
