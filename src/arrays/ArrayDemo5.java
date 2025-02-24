package arrays;

import objectandclass.Person;

public class ArrayDemo5 {

	public static void main(String[] args) {
		
		Object[] a=new Object[5];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		a[0]=10;
		
		a[1]=20.33;
		
		a[2]="FLM";
		
		a[3]=new Person();
		
		((Person)a[3]).name="Sam";
		((Person)a[3]).age=35;
		((Person)a[3]).ph=9848022338L;;
		
		a[4]='a';
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
