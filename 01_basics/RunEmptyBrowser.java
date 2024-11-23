package basic01;

import org.openqa.selenium.chrome.ChromeDriver;

/*
 Run empty browser 
 */
public class RunEmptyBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(null);

	}

}
