package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MY%20PC/Desktop/multilist.html");
		List<String> list=new ArrayList<>();
		Set<String> ts = new TreeSet<>();//to print the duplicates
		 WebElement mtr = driver.findElement(By.id("mtr"));
		 Select s=new Select(mtr);
		List<WebElement> allOptions = s.getOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			String text = allOptions.get(i).getText();
			if (!ts.add(text)) {
				list.add(text);
			}
			for (String text1 : list) {
				System.out.println(text1);
			}
		}
		 

}
}