package assignament;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Qspiders");
		Thread.sleep(2000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'spiders')]"));
		int count = allSugg.size();
		System.out.println(count+" Auto suggestion found");
		for(int i=0;i<count;i++)
		{
			System.out.println(allSugg.get(i).getText());
			if(i==count-1)
			{
				allSugg.get(i).click();
			}
		}
		Thread.sleep(5000);
		driver.close();
	}public QspidersAutoSuggestion() {
		// TODO Auto-generated constructor stub
	}
}
