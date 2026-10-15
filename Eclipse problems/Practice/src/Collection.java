import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
public class Collection {
	static void linkedList() {

	    List<Integer> a = new ArrayList<>();

	    a.add(11);
	    a.add(12);
	    a.add(13);
	    a.add(14);
	    a.add(15);

	    List<Integer> ld = new LinkedList<>();

	    ld.add(30);
	    ld.add(10);
	    ld.add(17);
	    ld.add(42);
	    ld.add(30);

	    ld.addAll(a);

	    System.out.println("LinkedList: " + ld);

	    boolean pa = ld.contains(30);

	    int sum = 0;
	    int largest = ld.get(0);
	    int smallest = ld.get(0);
	    int even = 0;
	    int odd = 0;
	    int number30 = 0;

	  
	    for(int x : ld) {

	        sum += x;

	        if(x > largest) {
	            largest = x;
	        }

	        if(x < smallest) {
	            smallest = x;
	        }

	        if(x % 2 == 0) {
	            even++;
	        } else {
	            odd++;
	        }

	        if(x == 30) {
	            number30++;
	        }
	    }

	    System.out.println("1. Sum: " + sum);
	    System.out.println("2. Largest: " + largest);
	    System.out.println("3. Smallest: " + smallest);
	    System.out.println("4. Average: " + ((double) sum / ld.size()));
	    System.out.println("5. Even count: " + even);
	    System.out.println("6. Odd count: " + odd);
	    System.out.println("7. 30 exists: " + pa);
	    System.out.println("8. 30 count: " + number30);

	    System.out.print("9. Reverse order: ");

	    for(int i = ld.size() - 1; i >= 0; i--) {
	        System.out.print(ld.get(i) + " ");
	    }
	    for(int i = 0; i < ld.size(); i++) {
	        for(int j = i + 1; j < ld.size(); j++) {

	            if(ld.get(i) < ld.get(j)) {
	                int temp = ld.get(i);
	                ld.set(i, ld.get(j));
	                ld.set(j, temp);
	            }
	        }
	    }
	    System.out.println("\n10. Descending: " + ld);
	    for(int i = 0; i < ld.size(); i++) {

            for(int j = i + 1; j < ld.size(); j++) {

                if(ld.get(i) > ld.get(j)) {

                    int temp = ld.get(i);
                    ld.set(i, ld.get(j));
                    ld.set(j, temp);
                }
            }
        }
	    System.out.println("\n11. Ascending: "+ld);
	}
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
	System.out.println(" ");
	
	linkedList();
	}
}
