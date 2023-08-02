package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserandPasswordequalornot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int h1 = driver.findElement(By.id("username")).getSize().getHeight();
		int w1 = driver.findElement(By.id("username")).getSize().getWidth();
		int h2 = driver.findElement(By.name("pwd")).getSize().getHeight();
		int w2 = driver.findElement(By.name("pwd")).getSize().getWidth();
		System.out.println("height of username textfield:"+h1);
		System.out.println("width of username textfield:"+w1);
		System.out.println("height of pwd textfield:"+h2);
		System.out.println("width of pwd textfield:"+w2);
		if(h1==h2&&w1==w2) {
			System.out.println("height and width of username and password textfield is same");
		}
		else{
			System.out.println("height and width of username and password textfield is not same");
		}
		driver.close();
	}

}
