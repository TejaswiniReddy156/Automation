package assignament;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("chrome://settings/appearance");
		 SearchContext p1 = driver.findElement(By.tagName("settings-ui")).getShadowRoot();
		 SearchContext p2 = p1.findElement(By.id("main")).getShadowRoot();
		 SearchContext p3 = p2.findElement(By.cssSelector("(settings-basic-page[class='cr-centered-card-container'])")).getShadowRoot();
		WebElement p4 = p3.findElement(By.cssSelector("(settings-section[page-title='Appearance'])"));
		SearchContext p5 = p4.findElement(By.tagName("settings-appearance-page")).getShadowRoot();
		SearchContext p6 = p5.findElement(By.cssSelector("(settings-toggle-button[label='Show home button'])")).getShadowRoot();
		p6.findElement(By.xpath("cr-toggle[id='control']")).click();
		
		
		
	}

}
