package polymorphism.constructors;

public class Clock {
	
	int hr,min,sec;
	
	
	  public Clock() { 
		  hr=10; 
		  min=10; 
		  sec=10;
		  }
	 
	public Clock(int hr)
	{
		this();
		this.hr=hr;
	}
	
	public Clock(int hr,int min)
	{
		//this.hr=hr;
		this(hr);
		this.min=min;
		//this(hr);
		//Constructor call must be the first statement in a constructor
	}

	public Clock(int hr,int min,int sec)
	{
		//this.hr=hr;
		//this.min=min;
		this(hr,min);
		this.sec=sec;
	}
	
	public void getClock()
	{
		System.out.format("%02d:%02d:%02d",hr,min,sec);
		System.out.println();
		
	}
	
	
}
