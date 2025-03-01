package exceptions;

public class UnSupportedBrowserException extends RuntimeException {
	
	
	public UnSupportedBrowserException()
	{
		super("Unsupported browser ..please user chrome or forfox or edge ..");
	}

}
