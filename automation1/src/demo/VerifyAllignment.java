package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int un = driver.findElement(By.name("username")).getLocation().getX();
		int pwd = driver.findElement(By.name("pwd")).getLocation().getX();
		System.out.println(un);	
		System.out.println(pwd);
		if(un==pwd) {
			System.out.println("un and pwd are properly alligned");
		}
		else{
			System.out.println("un and pwd are not properly alligned");
		}
		driver.close();
	}

}
