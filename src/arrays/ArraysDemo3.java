package arrays;

import objectandclass.Person;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		
		Person[] p=new Person[5];
		
		System.out.println(p.length);
		
	
		
		
		
		
		
		for(int i=0;i<p.length;i++)
		{
			if(p[i]!=null)
			{
				System.out.println(p[i].name);
				System.out.println(p[i].age);
				System.out.println(p[i].ph);
			}
		}
		
		
		p[0].name="john";
		p[0].age=30;
		p[0].ph=78220221542l;
		
		
		for(int i=0;i<p.length;i++)
		{
			if(p[i]!=null)
			{
				System.out.println(p[i].name);
				System.out.println(p[i].age);
				System.out.println(p[i].ph);
			}
		}
		
		
		
		
	}

}
