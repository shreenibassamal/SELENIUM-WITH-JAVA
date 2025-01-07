package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class KFC {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		String titleOfWebpage = driver.getTitle();
		
		String urlOfWebpage = driver.getCurrentUrl();
		System.out.println(urlOfWebpage);
		System.out.println(titleOfWebpage);

	}

}
