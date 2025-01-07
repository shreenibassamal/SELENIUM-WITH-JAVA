package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();//Launch browser
		driver.get("https://www.instagram.com/");
		 String titleOfWebpage1 = driver.getTitle();
		driver.get("https://www.flipkart.com/"); //navigate to url
		
		//Capture the title
		 String titleOfWebpage = driver.getTitle();
		 System.out.println(titleOfWebpage1);
		 System.out.println(titleOfWebpage);

	}

}
