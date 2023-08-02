package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlNavigation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhg.org/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.selenium.dev/"))
		{
			System.out.println("url is navigating successfully and pass");
		}
		else {
			System.out.println("url is not navigating successfully and fail");
		}
		driver.close();
	}

}
