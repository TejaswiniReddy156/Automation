package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintXandYaxis {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");                                                                                                                                                                                                                      
		int Xaxis = driver.findElement(By.name("login")).getLocation().getX();
		int Yaxis=driver.findElement(By.name("login")).getLocation().getY();
		System.out.println("X-axis :"+Xaxis);
		System.out.println("Y-axis :"+Yaxis);
		driver.close();
	
	}

}
