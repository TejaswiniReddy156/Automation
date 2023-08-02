package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Presentation {
	
	public static void test(WebDriver driver) {
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.youtube.com/");
		String title = driver1.getTitle();
		System.out.println(title);
		driver1.close();
	}

}
