import java.util.*;
import java.util.Collection;
import java.util.Map.Entry;
public class MapProblem {
	static void pro()
	{
		Map<Integer,String> cl = new HashMap<>();
		cl.put(8031,"ram");
		cl.put(8032, "vishnu");
		cl.put(8033, "nagulan");
		cl.put(8034, "karthi");
		cl.put(8035,"dhanush");
		cl.put(8036, "kumar");
		System.out.println(cl);
		System.out.println("Std kumar present: "+(boolean)cl.containsKey(8032));
		Collection<String> in = cl.values();
		System.out.println("update an existing value: "+in);
		String remove = cl.remove(8036);
		System.out.println("remove std id 8036: "+remove);
		System.out.println("balance std: "+cl);
		System.out.println("std id 8036 existing: "+((boolean)cl.containsValue("kumar")));
		System.out.println("map size: "+cl.size());
		System.out.println("check map is empty or not: "+((boolean)cl.isEmpty()));
		cl.clear();
		System.out.println("map clear: "+cl);
	}
	static void im()
	{
		System.out.println(" ");
		Map<Integer,String> cl = new HashMap<>();
		cl.put(8031,"ram");
		cl.put(8032, "vishnu");
		cl.put(8033, "nagulan");
		cl.put(8034, "karthi");
		cl.put(8035,"dhanush");
		
		Set<Integer> key = cl.keySet();
		System.out.println("total keys: "+key);
		Collection<String> value = cl.values();
		System.out.println("total values: "+value);
		Set<Entry<Integer,String>> es = cl.entrySet();
		System.out.println("key and value: "+es);
		
		System.out.println(" ");
		for(Entry<Integer,String> it:es)
		{
			System.out.println("for print one by one: "+it);
		}
		String id = cl.get(8032);
		if(id != null)
		{
			System.out.println("student ID 8032: "+id);
		}else {
			System.out.println("not find");
		}
		Map<Integer, Integer> marks = new HashMap<>();
		    marks.put(8031, 75);
		    marks.put(8032, 85);
		    marks.put(8033, 60);
		    marks.put(8034, 45);
		    marks.put(8035, 90);
		    System.out.println("current marks: "+marks);
		    
		    int updateId = 8032;

		    if(marks.containsKey(updateId))
		    {
		        marks.put(updateId, 95);
		        System.out.println("Updated marks: " + marks.get(updateId));
		    }
		    else
		    {
		        System.out.println("Student ID not found");
		    }
		    System.out.println("update marks: "+marks);
		    String re = cl.remove(8032);
		    System.out.println("Remove a student using their ID: "+re);
		    System.out.println("balance list of student: "+cl);
		    
	}
	static void studentMarks()
	{
		System.out.println(" ");
	    Map<String, Integer> marks = new LinkedHashMap<>();

	    marks.put("Ram", 75);
	    marks.put("Vishnu", 85);
	    marks.put("Nagulan", 60);
	    marks.put("Karthi", 45);
	    marks.put("Dhanush", 90);
	    
	    int highest = Integer.MIN_VALUE;
	    int lowest = Integer.MAX_VALUE;
	    int sum = 0;
	    int above50 = 0;
	    String scored = "";
	    for(Map.Entry<String, Integer> entry : marks.entrySet())
	    {
	        int mark = entry.getValue();
	       
	        if(mark > highest)
	        {
	            highest = mark;
	            scored = entry.getKey();
	        }

	       
	        if(mark < lowest)
	        {
	            lowest = mark;
	        }

	      
	        sum += mark;

	      
	        if(mark > 50)
	        {
	            above50++;
	        }
	        if(mark >85)
	        {
	        	
	        }
	    }
	    System.out.println("Highest mark: " + highest);
	    System.out.println("Lowest mark: " + lowest);
	    System.out.println("Average marks: " +((float)sum/5));
	    System.out.println("Students above 50: " + above50);
	    System.out.println("Highest scoring student: " + scored);
	}
	public static void main(String[] args) {
		pro();
		im();
		studentMarks();
	}
	
}
