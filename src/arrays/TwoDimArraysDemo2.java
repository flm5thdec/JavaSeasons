package arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoDimArraysDemo2 {

	public static void main(String[] args) throws InterruptedException {

		String[][] data=new String[2][4];
		
		System.out.println("length "+data.length);   //no of rows ==> 2
		 
		System.out.println(data[0].length);   // no of coulmns in row 0 ==> 4
		
		System.out.println(data[1].length);   // no of coulmns in row 1 ==> 4
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		data[0][0]="reyaz";
		data[0][1]="reyaz123";
		data[0][2]="reyaz s";
		data[0][3]="abcd@gmail.com";
		
		data[1][0]="kumar";
		data[1][1]="kumar123";
		data[1][2]="kumar m";
		data[1][3]="xyz@gmail.com";
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("New User Register Here")).click();
		
		for(int i=0;i<data.length;i++)
		{
			
				
				driver.findElement(By.id("username")).sendKeys(data[i][0]);
				Thread.sleep(2000);
				driver.findElement(By.id("password")).sendKeys(data[i][1]);
				Thread.sleep(2000);
				driver.findElement(By.id("re_password")).sendKeys(data[i][1]);
				Thread.sleep(2000);
				driver.findElement(By.id("full_name")).sendKeys(data[i][2]);
				Thread.sleep(2000);
				driver.findElement(By.id("email_add")).sendKeys(data[i][3]);
				Thread.sleep(2000);
				
				driver.findElement(By.id("Submit")).click();
				Thread.sleep(2000);
				
				driver.navigate().back();
				
				driver.findElement(By.linkText("New User Register Here")).click();
				
			
			System.out.println();
		}
		
		driver.quit();

		
	}

}
