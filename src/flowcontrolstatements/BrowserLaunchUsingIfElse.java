package flowcontrolstatements;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchUsingIfElse {

	public static void main(String[] args) {

		System.out.println("Enter the browser you wish to launch ");

		Scanner input = new Scanner(System.in);

		String browserName = input.next();

		switch (browserName) {

		case "chrome":
			new ChromeDriver();
			break;
		case "firefox":
			new FirefoxDriver();
			break;
		case "edge":
			new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser choice ..");

		}

		input.close();

	}

}
