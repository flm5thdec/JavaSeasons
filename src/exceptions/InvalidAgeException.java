package exceptions;

public class InvalidAgeException extends RuntimeException {
	
	
	public InvalidAgeException()
	{
		super("Invalid age ..please visit this website once your age is 18 ..");
	}

}
