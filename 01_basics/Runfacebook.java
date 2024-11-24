package basic01;

/*
*lunch facebook in chrome browser.
*/

import org.openqa.selenium.chrome.ChromeDriver;
public class Runfacebook {

	public static void main(String[] args) {
		ChromeDriver dr = new ChromeDriver();
		dr.get("https:/wwww.facebook.com/");
		
	dr.close();
	dr.quit();
		

	}

}
