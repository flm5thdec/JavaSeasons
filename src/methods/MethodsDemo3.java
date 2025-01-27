package methods;

public class MethodsDemo3 {
	
	//static method
	public static void natSum1(int n)
	{
		int res=n*(n+1)/2;
		System.out.println("sum of "+n+" natural numbers is "+res);
	}

	public static void main(String[] args) {
		
		MethodsDemo3.natSum1(5);
		MethodsDemo3.natSum1(10);
		MethodsDemo3.natSum1(100);
		MethodsDemo3.natSum1(1000);
		
	}
	
	

}
