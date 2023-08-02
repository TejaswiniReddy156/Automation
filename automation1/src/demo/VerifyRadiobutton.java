package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRadiobutton {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		int female = driver.findElement(By.name("sex")).getLocation().getY();
		int male = driver.findElement(By.name("sex")).getLocation().getY();
		int custom=driver.findElement(By.name("sex")).getLocation().getY();
		System.out.println(female);
		System.out.println(male);
		System.out.println(custom);
		if(female==male&&male==custom&&female==custom) {
			System.out.println("gender radio buttons are properly alligned");
		}
		else {
				System.out.println("gender radio buttons are not properly alligned");
			}
		driver.close();
	}

}
