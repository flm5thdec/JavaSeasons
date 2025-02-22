package arrays;

import java.util.Scanner;

public class Practise3 {

	public static void main(String[] args) {

		System.out.println("Enter the dept is : ");

		Scanner obj1 = new Scanner(System.in);

		String mahe = obj1.next();

		System.out.println("Enter the salary is : ");

		Scanner obj2 = new Scanner(System.in);

		Double D = obj2.nextDouble();

		if (mahe.equals("non-it"))

		{

			if (D > 0 && D <= 10000) {

				D += (D * 0.1);

			}

			else if (D > 10000 && D <= 20000) {

				D += (D * 0.2);

			} else if (D > 20000 && D <= 30000) {

				D += (D * 0.3);

			}

			else if (D > 30000 && D <= 40000) {

				D += (D * 0.4);

			}

			else if (D > 40000 && D <= 50000) {

				D += (D * 0.5);

			}

			else {

				System.out.println("Invalid number is : ");

			}
			
			System.out.println("Enter your monthly salary is " + D);

			obj1.close();

			obj2.close();


		}

		else {

			if (D > 0 && D <= 10000) {

				D += (D * 0.2);

			}

			else if (D > 10000 && D <= 20000) {

				D += (D * 0.3);

			} else if (D > 20000 && D <= 30000) {

				D += (D * 0.4);

			}

			else if (D > 30000 && D <= 40000) {

				D += (D * 0.5);

			}

			else if (D > 40000 && D <= 50000) {

				D += (D * 0.6);

			}

			else {

				System.out.println("Invalid number is ");
				
			}

				System.out.println("Enter your monthly salary is " + D);

				obj1.close();

				obj2.close();

		

		}

	}

}