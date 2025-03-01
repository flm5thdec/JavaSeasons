package exceptions;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunching {

	public static void main(String[] args) {

		System.out.println("Enter browser you need to launch.. ");

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
			try {
				throw new UnSupportedBrowserException();
			} catch (UnSupportedBrowserException obj) {
				System.out.println(obj.getMessage());
			}
			break;
		}

	}

}
