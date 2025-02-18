package operators;

import java.util.Scanner;

public class TernanyOperator {

	public static void main(String[] args) {
		
		System.out.println("Enter some Integer ");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
	   System.out.println(	x>=0?"+ve":"-ve");
		
		input.close();

	}

}
