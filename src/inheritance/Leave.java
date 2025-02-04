package inheritance;

public class Leave extends Marks{
	
	int sl,cl;
	
	public void setLeaves(int sl,int cl)
	{
		this.sl=sl;
		this.cl=cl;
	}
	
	public void getLeaves()
	{
		System.out.println("Total no leaves taken : "+(sl+cl));
	}
	
	//override
	
		public void getDetails()
		{
			System.out.println("Roll no is : "+rollNo);
			System.out.println("--------------");
			System.out.println("Student name is "+sNa);
		}

}
