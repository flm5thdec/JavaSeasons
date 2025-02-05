package inheritance;

public class Two extends One {
	
	int a;
	
	Two()
	{
		super(3);
		System.out.println("Two's constructor ");
		
	}
	
	
	
	void putA(int a)
	{
		this.a=a;
	}
	
	void display()
	{
		System.out.println("a is "+super.a);
		super.greet();
	}
	
	void greet()
	{
		System.out.println("Hello..");
	}

}
