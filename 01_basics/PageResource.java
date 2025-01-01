package basic01;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageResource {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		String a = driver.getPageSource();
		System.out.println(a);
	}

}
