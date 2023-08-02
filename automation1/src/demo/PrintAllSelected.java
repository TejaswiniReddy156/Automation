package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelected {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MY%20PC/Desktop/multilist.html");
		WebElement mtrlistbox = driver.findElement(By.id("slv"));
		Select s=new Select(mtrlistbox);
		List<WebElement> allSoption = s.getOptions();
		for (int i = 0; i<allSoption.size() ; i++) {
			String text = allSoption.get(i).getText();
			System.out.println(text);
			
		}
		

	}

}
