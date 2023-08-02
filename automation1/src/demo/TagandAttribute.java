package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagandAttribute {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String tagname = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		String attribute = driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
		System.out.println(tagname);
		System.out.println(attribute);
		driver.close();
	}

}
