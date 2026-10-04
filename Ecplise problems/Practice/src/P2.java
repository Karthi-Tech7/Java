
public class P2 {

	public void daySelection(String day)
	{
		switch(day) {
		case "monday":{
			System.out.println("first day");
			break;
		}
		case "tuesday":{
			System.out.println("second day");
			break;
		}
		case "wednesday":{
			System.out.println("third day");
			break;
		}
		case "thursday":{
			System.out.println("fourth day");
			break;
		}
		case "friday":{
			System.out.println("fifth day");
			break;
		}
		case "saturday":{
			System.out.println("sixth day");
			break;
		}
		case "sunday":{
			System.out.println("seventh day");
			break;
		}
		default:{
			System.out.println("no mathcing day");
		}
		}
	}
	public static void main(String[] args) {
		P2 a = new P2();
		a.daySelection("friday");
	}
}
