import java.util.List;
import java.util.ArrayList;
public class Collection {
	public static void main(String[] args) {
		
	
	List<Integer> a = new ArrayList<>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	Object object = a.size();
	int i1 = a.get(1);
	boolean bo = a.contains(4);
	System.out.println("==forloop==");
	for(int i=0;i<=a.size()-1;i++)
	{
		Object ob = a.get(i);
		System.out.println(ob);
	}
	System.out.println("==enhancedforloop==");
	for(Object b:a)
	{
		System.out.println(b);

	}
	
	System.out.println("The size of list: "+object);
	System.out.println("elements using a index: "+i1);
	a.set(0,10);
	System.out.println("set: "+a);
	a.remove(0);
	System.out.println("remove:"+a);
	System.out.println("contains: "+bo);
	a.clear();
	System.out.println("clear array: "+a);
	

	}
}
