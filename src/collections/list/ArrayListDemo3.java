package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
	
		List<String> listOfStudents=new ArrayList<String>();
		
		listOfStudents.add("Anuja");
		
		listOfStudents.add("Amar");
		
		listOfStudents.add("Asha");
		
		listOfStudents.add("Venkata");
		
		listOfStudents.add("Mahesh");
		
		System.out.println("using normal for loop ");
		//using normal for loop 
		for(int i=0;i<listOfStudents.size();i++)
		{
			System.out.println(listOfStudents.get(i));
		}
		
		
		System.out.println("using for each  loop ");		
		
		for(String temp:listOfStudents)
		{
			System.out.println(temp);
		}
		
		System.out.println("using iterator method ");
		
		Iterator<String> it=listOfStudents.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
