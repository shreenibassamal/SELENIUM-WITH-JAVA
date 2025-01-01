package basic01;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentURL {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String a = driver.getCurrentUrl();
		System.out.println(a);

	}

}
