package methods;

public class MethodsDemo2 {
	
	//non-static method
	public void natSum1(int n)
	{
		int res=n*(n+1)/2;
		System.out.println("sum of "+n+" natural numbers is "+res);
	}

	public static void main(String[] args) {
		
		//object creation
		MethodsDemo2 obj1=new MethodsDemo2();
		obj1.natSum1(5);
		obj1.natSum1(10);
		obj1.natSum1(100);
		obj1.natSum1(1000);

	}
	
	

}
