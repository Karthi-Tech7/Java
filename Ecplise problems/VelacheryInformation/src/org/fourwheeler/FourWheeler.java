package org.fourwheeler;

//import java.nio.charset.MalformedInputException
import org.allvehicle.Vehicle;
import org.towwheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;
public class FourWheeler {
	public void car()
	{
		System.out.println("High and low price and 2nd hand cars also");
	}
	public void bus()
	{
		System.out.println("government bus and private SETC also");
	}
	public void lorry()
	{
		System.out.println("container and load lorry rent,2nd hand,pric ");
	}
	
public static void main(String[] args) {
	Vehicle b = new Vehicle();
	b.vehicleNecessery();
	TwoWheeler c =new TwoWheeler();
	c.bike();
	c.bycycle();
	ThreeWheeler d = new ThreeWheeler();
	d.auto();
	FourWheeler a = new FourWheeler();
	a.car();
	a.bus();
	a.lorry();	
}
}
