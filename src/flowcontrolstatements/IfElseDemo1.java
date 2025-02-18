package flowcontrolstatements;

import java.util.Scanner;

public class IfElseDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter your salary ");
		Scanner input=new Scanner(System.in);
		Double sal=input.nextDouble();
		
		if(sal >0  && sal <=10000)
		{
			sal=sal+(sal*0.1);
		}
		else if(sal > 10000 && sal <=20000)
		{
			sal+=(sal*0.2);
		}
		else if(sal >20000 && sal <=30000)
		{
			sal=sal+(sal*0.3);
		}
		else
		{
			sal=sal+(sal*0.4);
		}
		
		System.out.println("Your salary for this month is "+sal);
		
		int x=0;
		if(true)
		{
			System.out.println("Hi ");
		}
		else
		{
			System.out.println("Hello..");
		}
		input.close();

	}

}
