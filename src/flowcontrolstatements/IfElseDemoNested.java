package flowcontrolstatements;

import java.util.Scanner;

public class IfElseDemoNested {

	public static void main(String[] args) {
		
		System.out.println("Enter your dept ");
		Scanner input1 = new Scanner(System.in);
		String dept = input1.next();

		System.out.println("Enter your salary ");
		Scanner input2 = new Scanner(System.in);
		Double sal = input2.nextDouble();

		// nested if else

		if (dept.equals("non-it"))  {

			if (sal > 0 && sal <= 10000) {
				sal = sal + (sal * 0.1);
			} else if (sal > 10000 && sal <= 20000) {
				sal += (sal * 0.2);
			} else if (sal > 20000 && sal <= 30000) {
				sal = sal + (sal * 0.3);
			} else {
				sal = sal + (sal * 0.4);
			}
		} else if(dept.equals("it")){
			if (sal > 0 && sal <= 10000) {
				sal = sal + (sal * 0.2);
			} else if (sal > 10000 && sal <= 20000) {
				sal += (sal * 0.3);
			} else if (sal > 20000 && sal <= 30000) {
				sal = sal + (sal * 0.4);
			} else {
				sal = sal + (sal * 0.5);
			}
		}
		else
		{
			System.out.println("Entered wrong dept");
		}
	
		System.out.println("Your salary for this month is " + sal);

		input1.close();
		input2.close();

	}

}
