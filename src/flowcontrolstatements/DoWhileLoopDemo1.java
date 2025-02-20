package flowcontrolstatements;

import java.util.Scanner;

public class DoWhileLoopDemo1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		String uname=null;
		String pwd=null;
		
		do {
			
			System.out.println("Enter username : ");
			uname=input.next();
			System.out.println("Enter password : ");
			pwd=input.next();
			
			if(uname.equals("reyaz0806") && pwd.equals("reyaz123"))
			{
				System.out.println("Welcome to hotel booking page ..");
				break;
			}
			else
			{
				System.out.println("Incorrect Credentials");
			}
			
		}while(true);
		

	}

}
