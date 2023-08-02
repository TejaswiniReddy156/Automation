package demo;


import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllinAlphabetical{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MY%20PC/Desktop/multilist.html");
		 WebElement mtr = driver.findElement(By.id("mtr"));
		 Select s=new Select(mtr); //to print all the options in sorted order
		 TreeSet<String> ts=new TreeSet<>();
		 List<WebElement> allOptions = s.getOptions();
		 for (int i = 0; i <allOptions.size() ; i++) {
			 WebElement ele = allOptions.get(i);
			 String text = ele.getText();
			 ts.add(text);
		}
		for (String text : ts) {
			System.out.println(text);
			
		} 
		
		driver.close();
		}
		

	}	


