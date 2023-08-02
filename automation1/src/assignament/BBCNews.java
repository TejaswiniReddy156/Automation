package assignament;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNews {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.bbc.com/");
	driver.findElement(By.xpath("//a[@class='orbit-search__button']")).click();
	driver.findElement(By.id("search-input")).sendKeys("Business"+Keys.ENTER);
	 List<WebElement> allBusinessNews = driver.findElements(By.xpath("//p[@class='ssrcss-6arcww-PromoHeadline e1f5wbog6']"));
	int count=allBusinessNews.size();
	System.out.println(count);
	System.out.println("The top 5 news related to the business as of today are:");
	for(int i=0;i<5;i++)
	{
		System.out.println();
		System.out.println(allBusinessNews.get(i).getText());
	}
	driver.close();
}

}
