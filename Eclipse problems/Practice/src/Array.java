
public class Array {
	public void array()
	{
		int value[]= new int[5];
		value[0]=10;
		value[1]=20;
		value[2]=30;
		value[3]=40;
		value[4]=50;
		for(int i=0;i<value.length;i++)
		{
			System.out.println("value"+ i+" : "+value[i]);	
		}
		System.out.println("Total array store value: 5 \n");
	}
	
	void sum() {
		int total[]= {10,20,30,40,50};
		int count=0;
		for(int c:total)
		{
			System.out.println("Sum = "+c);
			count = count+c;
		}
		System.out.println("sum of all array elements: "+count);
		int average = count/total.length;
		System.out.println("Average of array elements: " + average);
	}
	void largest()
	{
		System.out.println(" ");
		int num[]= {12,17,40,7,80,60};
		int largest = num[0];
		int smallest = num[0];
		for(int a:num)
		{
			if(a>largest)
			{
				largest = a;
			}
			if(a<smallest)
			{
				 smallest = a;
			}
			
		}
		System.out.println("Largest element is: " + largest);
		System.out.println("smallest element in an array: "+smallest);
	}
	void count()
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("\neven value: ");
		for(int b:a)
		{
			if(b%2==0)
			{
				System.out.println(b);
			}
		}
		System.out.println("odd value: ");
		for(int c:a)
		{
			if(c%2!=0)
			{
				System.out.println(c);
			}
		}
	}
	void posneg()
	{
		int count[] = {7,8,-5,-4,-9,1,2,-3,6,-10};
		int pos=0;
		int neg=0;
		System.out.println("\n===Positive===");
		for(int a:count)
		{
			if(a>0)
			{
				pos++;
				System.out.println(a);
			}
		}
		System.out.println("count total positive: "+pos);
		System.out.println("===Negative===");
		for(int b:count)
		{
			if(b<0)
			{
				neg++;
				System.out.println(b);
			}
		}
		System.out.println("count total negative: "+neg);
	}
	
	void reverse() {
		int re[]= {10,20,30,40,50};
		System.out.println("\narray elements in reverse order: ");
		for(int i=re.length-1;i>=0;i--)
		{
			System.out.println(re[i]);
		}
		System.out.println("length of array = "+re.length);
	}
	public static void main(String[] args) {
		Array a = new Array();
		a.array();
		a.sum();
		a.largest();
		a.count();
		a.posneg();
		a.reverse();
	}
}
