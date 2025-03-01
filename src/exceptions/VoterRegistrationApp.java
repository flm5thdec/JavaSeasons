package exceptions;

import java.util.Scanner;

public class VoterRegistrationApp {
	
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to voting Registration website ..");
		System.out.println("Enter detials ");
		System.out.println("enter your age ");
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		if(age>=18)
		{
			System.out.println("Please proceed with registration...");
		}
		else
		{
			//System.out.println("Not eligible for voting ..age doesn't meet the criteria ..");
			
			try
			{
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
		System.out.println("End of program..");
	}

}
