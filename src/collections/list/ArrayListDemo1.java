package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		List al=new ArrayList();
		
		
		System.out.println(al.size());
		
		al.add(100);
		
		al.add("FLM");
		
		al.add(9848022338L);
		
		al.add('A');
		
		al.add(true);
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
	
	}

}
