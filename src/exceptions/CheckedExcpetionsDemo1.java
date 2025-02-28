package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExcpetionsDemo1 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException  {
		
		
		System.out.println("hi ..");

		//Unhandled exception type InterruptedException
		
		
		Thread.sleep(3000);
			
		new FileInputStream("D:\\FLM5thDec\\Test Scenario Template.xlsx");
		
		
		

	}

}
