package flowcontrolstatements;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {

		System.out.println("Enter your date of birth ");
		System.out.println("Enter date ");
		Scanner input1 = new Scanner(System.in);
		int date = input1.nextInt();
		System.out.println("Enter month ");
		int mon = input1.nextInt();
		System.out.println("Enter year ");
		int year = input1.nextInt();

		String month = null;

		// expected 19 2 2025 ==> 19-Feb-2025

		switch (mon) {
		case 1:
			month = "Jan";
			break;
		case 2:
			month = "Feb";
			break;
		case 3:
			month = "Mar";
			break;
		case 4:
			month = "Apr";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "Jun";
			break;
		case 7:
		{
			month = "Jul";
			break;
		}
		case 8:
			month = "Aug";
			break;
		case 9:
			month = "Sep";
			break;
		case 10:
			month = "Oct";
			break;
		case 11:
			month = "Nov";
			break;
		case 12:
			month = "Dec";
			break;
		default:
			System.out.println("Invalid month entered");

		}

		//System.out.format("%02d-%s-%04d", date, month, year);
		System.out.println(date+"-"+month+"-"+year);

	}

}
