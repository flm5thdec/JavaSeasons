package objectandclass;

public class Person {
	
	String name;
	
	int age;
	
	long ph;
	
	public void greet()
	{
		System.out.println("Hi "+name+"..Good Evening...");
	}
	
	
	public static Person getPerson()
	{
		return new Person();
		
	}

}
