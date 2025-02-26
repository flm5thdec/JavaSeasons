package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	
		List<String> listOfStudents=new ArrayList<String>();
		
		listOfStudents.add("Anuja");
		
		listOfStudents.add("Amar");
		
		listOfStudents.add("Asha");
		
		listOfStudents.add("Venkata");
		
		//listOfStudents.add(9848022338L); //Type safety after adding Generics 
		
		listOfStudents.add("Mahesh");
		
		
		//String[] students=new String[6];
		
		//students[0]="Anuja";
		//students[1]="Amar";
		//students[2]="Asha";
		//students[3]="Venkata";
		//students[4]=9848022338L;  //type safety 
		
		for(int i=0;i<listOfStudents.size();i++)
		{
			System.out.println(listOfStudents.get(i));
		}
		
		
		//listOfStudents.remove("Asha");
		listOfStudents.remove(3);
		
		for(int i=0;i<listOfStudents.size();i++)
		{
			System.out.println(listOfStudents.get(i));
		}

	}

}
