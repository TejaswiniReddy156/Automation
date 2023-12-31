package assignament;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartMobileGetText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Iphone 14 pro max"+Keys.ENTER);
		List<WebElement> allPhones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/../../div[2]/div[1]/div[1]/div[1]"));
		int count=allPhones.size();
		for(int i=0;i<count;i++)
		{
			String phoneName = allPhones.get(i).getText();
			String price = allPrice.get(i).getText();
			System.out.println("Mobile name: "+phoneName+" =>>> Price of the mobile: "+price);

		}
		driver.close();
	}

}
