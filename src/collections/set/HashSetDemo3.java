package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		
		Set<String> hs=new HashSet<String>();
		
		hs.add("Selenium");
		hs.add("Java");
		hs.add("FLM");
		hs.add("Python");
		hs.add("Cucumber");
		
		
		System.out.println(hs);
		
		System.out.println("using for each loop");
		//using for each loop
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		System.out.println("using iterator method ..");
		Iterator<String> obj=hs.iterator();
		while(obj.hasNext())
		{
			String s=obj.next();
			System.out.println(s);
		}
		
		
		
	}

}
