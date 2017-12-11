package JavaTopics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionsClass {
	
	public void method1()
	{
		List lt = new ArrayList();
		List lt2 = new ArrayList(3);
		List<String> lt3 = new ArrayList<String>(4);
		lt3.add("karim");
		lt3.add("Shaik");
		lt3.add("Karil");
		lt3.add("Babu");
		lt3.add("karim");
		lt3.add(null);
		lt3.add("Karil");
		lt3.add("Babu");
		lt3.add("karim");
		lt3.add("Shaik");
		lt3.add(null);
		lt3.add("Babu");
		
	/*	for(int i=0;i<=lt3.size()-1;i++)
		{
			System.out.println(lt3.get(i));
		}
		
		ListIterator<String> it = lt3.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		Iterator<String> it2 = lt3.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
	}
	
	public static void main(String[] args)
	{
		CollectionsClass obj = new CollectionsClass();
		obj.method1();
	}

}
