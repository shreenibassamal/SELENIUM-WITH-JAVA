package basic01;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		driver.manage().window().maximize();

	}

}
