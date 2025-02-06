package abstraction;

public abstract class Numbers {
	
	
	//abstract
	abstract void compute(int x,int y);
	
	
	abstract void m1();
	
	abstract void m2(String s1);
	
	//concrete
	void greet()
	{
		System.out.println("Hi..");
	}

}
