package assignament;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripFlightList {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
		driver.findElement(By.xpath("(//input[@class='w-100p fs-4 fw-500 c-neutral-500'])[1]")).sendKeys("Bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='to-ellipsis o-hidden ws-nowrap fs-3 fw-500']")).click();
		driver.findElement(By.xpath("//input[@class='w-100p fs-4 fw-500 c-neutral-500']")).sendKeys("Goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[@class='to-ellipsis o-hidden ws-nowrap fs-3 fw-500'])[1]")).click();
		WebElement travelDate = driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']"));
		travelDate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='7'])[1]"));
		driver.findElement(By.xpath("//span[@class='fw-600 fs-4 lh-2 flex flex-middle']")).click();
		List<WebElement> flightName = driver.findElements(By.xpath("//p[@class='fw-500 fs-2 c-neutral-900']"));
		List<WebElement> flightTimings = driver.findElements(By.xpath("//p[@class='fw-500 fs-2 c-neutral-900']/../../../../../div[2]/div[1]/div[1]"));
		List<WebElement> flightDuration = driver.findElements(By.xpath("//p[@class='fw-500 fs-2 c-neutral-900']/../../../../../div[2]/div[1]/div[2]/p[1]"));
		List<WebElement> flightsArivalTime = driver.findElements(By.xpath("//p[@class='fw-500 fs-2 c-neutral-900']/../../../../../div[2]/div[1]/div[3]/p"));
		List<WebElement> flightsTicketPrice = driver.findElements(By.xpath("//p[@class='fw-500 fs-2 c-neutral-900']/../../../../../div[3]/div[2]/div/p[1]"));
		int count=flightName.size();
		System.out.println("The numbers of flights avaialbel from the given location to the destination on 07/07/2023 is : "+count+" and the details those flights disclosed below");
		System.out.println();
		System.out.println();
		for(int i=0;i<count;i++)
		{
			System.out.println("The name of the flight: "+flightName.get(i).getText()+"                                 timings: "+flightTimings.get(i).getText()+"                   Duration of the flight: "+flightDuration.get(i).getText()+"       Arrival Time: "+flightsArivalTime.get(i).getText()+"           Flight Ticket price: "+ flightsTicketPrice.get(i).getText());
		}
		driver.close();

	}

}
