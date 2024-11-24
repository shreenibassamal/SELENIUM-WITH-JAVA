package basic01;

import org.openqa.selenium.chrome.ChromeDriver;

/*
 * assignment 01
 * **********************************************
 * 1)Launch Browser(chrome).
 * 2)Open URL  https://www.facebook.com/
 * 3)validate title should be "Facebook – log in or sign up"
 * 4)close page
 */

public class Assignment_01 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("this is the title of the page"+driver.getTitle());
		String actualTitle = driver.getTitle();
		if (actualTitle.equals("Facebook – log in or sign up")) {
			System.out.println("Test passed");
			
		}
		else {
			System.out.println("Test failed");
			
		}
		driver.close();
		
	}

}
