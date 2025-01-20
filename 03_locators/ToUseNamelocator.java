package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNamelocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.instagram.com/");
//		Thread.sleep(4000);
//		//To enter user name
//		driver.findElement(By.name("username")).sendKeys("shreenibas");
//		Thread.sleep(2000);
//		//To enter password
//		driver.findElement(By.name("password")).sendKeys("Shree@password");
//		
		
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(4000);
		driver.quit();
		

	}

}
