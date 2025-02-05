package inheritance;

public class One {
	
	int a;
	
	One()
	{
		System.out.println("One's Constructor");
	}
	
	One(int b)
	{
		System.out.println("b is here");
	}
	
	void setA(int a)
	{
		this.a=a;
	}
	
	void greet()
	{
		System.out.println("Hi..");
	}
	

}
