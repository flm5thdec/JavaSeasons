package flowcontrolstatements;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchUsingSwitch {

	public static void main(String[] args) {

		System.out.println("Enter the browser you wish to launch ");
		
		Scanner input=new Scanner(System.in);
		
		String browserName=input.next();
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid browser choice..");
		}

		
		input.close();

	}

}
