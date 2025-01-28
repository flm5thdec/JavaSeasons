package methods;

import java.util.Scanner;

public class MethodsModels {

	public static void main(String[] args) {
	
		MethodsModels obj=new MethodsModels();
		//Model 1
		//obj.natSum();
		
		//model 2
		//int res2=obj.natSum2();
		//System.out.println(res2);
		
		//Model 3
		//System.out.println("Enter some value for n: ");
		//Scanner input=new Scanner(System.in);
		//int n=input.nextInt();
		//obj.natSum3(n);
		
		//Model 4
		System.out.println("Enter some value for n: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int res=obj.natSum4(n);
		System.out.println("Sum of "+n+" natural numbers is "+res);
	}
	
	
	//model 4
	//4) methods having return-type and arguments
	public int natSum4(int n)
	{
		int res=n*(n+1)/2;
		
		return res;
		
	}
	
	//model 3
	//3) methods with no return-type and having arguments 
	
	public void natSum3(int n)
	{
		int res=n*(n+1)/2;
		System.out.println("Sum of "+n+" natural numbers is "+res);
	}
	//model 2
	//2) methods with return type and no arguments
	
	public int natSum2()
	{
		System.out.println("Enter some value for n: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int res=n*(n+1)/2;
		System.out.print("Sum of "+n+" natural numbers is ");
		return res;
	}
	
	//model 1 
	// 1) methods without return-type and arguments 
	
	public void natSum()
	{
		System.out.println("Enter some value for n: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int res=n*(n+1)/2;
		System.out.println("Sum of "+n+" natural numbers is "+ res);
		
		
	}
	
	

}
