package objectandclass;

public class Person {
	
	public String name;
	
	public int age;
	
	public long ph;
	
	public void greet()
	{
		System.out.println("Hi "+name+"..Good Evening...");
	}
	
	
	public static Person getPerson()
	{
		return new Person();
		
	}

}
