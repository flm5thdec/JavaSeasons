package exceptions;

import objectandclass.Person;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		
		int i=2147483646;
		
		int x=10;
		
		int y=0;
		
		Person p=new Person();
		
		p.name="john";
		
		try
		{
		
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(p.name);
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Don't initialize zero for y ...");
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Don't give null to person object..");
		}
		
		catch(RuntimeException e)
		{
			
		}
		
		
		
		
		System.out.println("End of program..");

	}

}
