package exceptions;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		int i=2147483646;
		
		int x=10;
		
		int y=0;
		
		try
		{
		System.out.println(x/y);
		System.out.println(x%y);
		}
		catch(Exception e)  //executed only when exception is occured 
		{
			System.out.println("Don't initialize zero for y ...");
			
			//close the DB connection 
		}
	    finally //executed always (irrespective of exception)
		{
			System.out.println("finally block executed ..");
			//			if(!DBconnectionisClosed)
			//	{
	     		//close the DB connection 
			//	}
		
		}
		//close the DB connection  -- wrong approach 
		
		System.out.println("end of program..");
	}

}
