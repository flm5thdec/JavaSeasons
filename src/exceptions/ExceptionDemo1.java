package exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		
		int i=2147483646;
		
		int x=10;
		
		int y=0;
		
		try
		{
		System.out.println(x/y);
		System.out.println(x%y);
		}
		catch(Exception e)
		{
			System.out.println("Don't initialize zero for y ...");
		}
		
		
		System.out.println("End of program..");

	}

}
