package basic01;

/*
 * Lunch instagram application
 */

import org.openqa.selenium.chrome.ChromeDriver;
public class RunInstagram {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.instagram.com/");
	driver.close();
	driver.quit();

	}

}
