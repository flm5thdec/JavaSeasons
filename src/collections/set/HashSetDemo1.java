package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set<String>	hs=new HashSet<String>();
		//List<String> hs=new ArrayList<String>();
		
		//System.out.println("FLM".hashCode()%16);
		
		hs.add("FLM");
		
		//System.out.println("Selenium".hashCode()%16);
		
		hs.add("Selenium");
		
		
		//System.out.println("Java".hashCode()%16);
		
		hs.add("Java");
		
		System.out.println(hs.size()); //3
		
		System.out.println(hs);
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		hs.add("FLM");
		
		hs.add("Selenium");
		
		hs.add("Java");
		
		System.out.println(hs.size()); //3
		

		for(String temp:hs)
		{
			System.out.println(temp);
		}
	}

}
