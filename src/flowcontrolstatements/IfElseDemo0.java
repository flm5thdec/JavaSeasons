package flowcontrolstatements;

import java.util.Scanner;

public class IfElseDemo0 {

	public static void main(String[] args) {
		

		System.out.println("Enter some Integer ");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		if(x>=0)
		{
			System.out.println("+ve");
		}
		else
		{
			System.out.println("-ve");
		}
		
		input.close();

	}

}
