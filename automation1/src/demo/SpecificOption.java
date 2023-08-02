package demo;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecificOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MY%20PC/Desktop/multilist.html");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the dish name");
		String name = s.nextLine();
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select select=new Select(mtr);
		List<WebElement> alloptions = select.getOptions();
		int count=0;
		for(WebElement ele:alloptions) {
			String text = ele.getText();
			if(text.equals(name)) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("dish is present in the dropdown");
		}
		else {
				System.out.println("dish is present in the dropdown");
			}
}
}