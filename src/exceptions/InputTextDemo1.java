package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputTextDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver 		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("SaiPriya");
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("firstName")).getAttribute("value"));
		
		
		driver.quit();

	}

}
