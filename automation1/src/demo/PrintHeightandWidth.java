package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightandWidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*int height = driver.findElement(By.name("login")).getSize().getHeight();
		int width = driver.findElement(By.name("login")).getSize().getWidth();
		System.out.println("height :"+height);
		System.out.println("width :"+width);*/
		WebElement login = driver.findElement(By.name("login"));
		int height = login.getSize().getHeight();
		int width = login.getSize().getWidth();
		System.out.println("height :"+height);
		System.out.println("width :"+width);
		driver.close();
	}

}
