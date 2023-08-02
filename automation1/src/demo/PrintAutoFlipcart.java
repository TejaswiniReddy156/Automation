package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoFlipcart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'iphone')]"));
		int count = allsugg.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
		
	}
}