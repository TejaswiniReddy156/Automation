package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Renew {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.careinsurance.com/");
		//driver.findElement(By.xpath("//a[text()='Renew']")).click();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='policynumber']")).click();
		driver.findElement(By.xpath("//input[@name='policynumber']")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(month);
		s.selectByIndex(5);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(year);
		s1.selectByValue("1925");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-date='15']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9491335104");
		Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean dis = driver.findElement(By.name("policynumber")).isDisplayed();
		System.out.println(dis);
		String text = driver.findElement(By.id("policynumberError")).getText();
		System.out.println(text);
		driver.close();
		
		
		
	}

}
