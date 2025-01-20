package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdLocators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(3000);
//		
//		//to work on username TextfieldId
//		driver.findElement(By.id("email")).sendKeys("shreenibas@gmail.com");
//		Thread.sleep(2000);
//		
//		//To work on PasswordTextfield
//		driver.findElement(By.id("pass")).sendKeys("Shree@751");
		
		
		driver.get("https://www.actitime.com/free-online-trial");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("FirstName")).sendKeys("Shreenibas");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Samal");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("shreenibassamal@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Company")).sendKeys("Shree Automation Lab");
		
		driver.quit();
		
		

	}

}
