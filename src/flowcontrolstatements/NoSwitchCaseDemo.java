package flowcontrolstatements;

import java.util.Scanner;

public class NoSwitchCaseDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter your date of birth ");
		System.out.println("Enter date ");
		Scanner input1 = new Scanner(System.in);
		int date=input1.nextInt();
		System.out.println("Enter month ");
		int mon=input1.nextInt();
		System.out.println("Enter year ");
		int year=input1.nextInt();
		
		String month=null;
		
		//expected  19 2 2025  ==> 19-Feb-2025
		
		if(mon==1)
		{
			month="Jan";
		}
		else if(mon==2)
		{
			month="Feb";
		}
		else if(mon==3)
		{
			month="Mar";
		}
		else if(mon==4)
		{
			month="Apr";
		}
		else if(mon==5)
		{
			month="May";
		}
		else if(mon==6)
		{
			month="Jun";
		}
		else if(mon==7)
		{
			month="Jul";
		}
		else if(mon==8)
		{
			month="Aug";
		}
		else if(mon==9)
		{
			month="Sep";
		}
		else if(mon==10)
		{
			month="Oct";
		}
		else if(mon==11)
		{
			month="Nov";
		}
		else if(mon==12)
		{
			month="Dec";
		}
		
		System.out.format("%02d-%s-%04d",date,month,year);
	
		

	}

}
