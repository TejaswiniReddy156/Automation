package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBOx {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MY%20PC/Desktop/multilist.html");
		WebElement multilist = driver.findElement(By.id("mtr"));
		Select s=new Select(multilist);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("dosa");
		s.selectByVisibleText("vada");
		s.selectByIndex(1);
		s.selectByValue("d");
		System.out.println(s.isMultiple());
	}

}
