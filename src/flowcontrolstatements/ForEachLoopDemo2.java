package flowcontrolstatements;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopDemo2 {

	public static void main(String[] args) {
		
		
		List<String> listOfStudents=new ArrayList<String>();
		
		listOfStudents.add("Anuja");
		
		listOfStudents.add("Amar");
		
		listOfStudents.add("Asha");
		
		listOfStudents.add("Venkata");
		
		listOfStudents.add("Mahesh");
		
		//normal for loop
		
		for(int i=0;i<listOfStudents.size();i++)
		{
			System.out.println(listOfStudents.get(i));
		}
		
		//for each loop
		
		for(String temp:listOfStudents)
		{
			System.out.println(temp);
		}
		

	}

}
