package polymorphism;

public class Sum {
	
	
	public void add(int x,int y)
	{
		System.out.println("sum is "+(x+y));
	}
	
	/*
	 * public void addThreeInt(int x,int y,int z) {
	 * System.out.println("sum is "+(x+y+z)); }
	 * 
	 * public void addDouble(double x,double y) {
	 * System.out.println("Sum is "+(x+y)); }
	 * 
	 * public void addLong(long x,long y) { System.out.println("sum is "+(x+y)); }
	 */
	
	public void add(int x,int y,int z)
	{
		System.out.println("sum is "+(x+y+z));
	}
	
	public void add(double x,double y)
	{
		System.out.println("Sum is "+(x+y));
	}
	
	public void add(long x,long y)
	{
		System.out.println("Sum is "+(x+y));
	}
	
	public void add(String a,String  b)
	{
		System.out.println("Sum of "+a+b);
	}
	
	//var args
	public void add(int ...a)
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
		}
		
		System.out.println(res);
	}
	
	
	
	
	
	
	
	
	
	

}
