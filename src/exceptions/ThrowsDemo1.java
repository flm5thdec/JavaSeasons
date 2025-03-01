package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("hi...");
		
		Thread.sleep(3000);
		
		try {
			new FileInputStream("D:\\FLM5thDec\\Manual Testing Running Notes.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
