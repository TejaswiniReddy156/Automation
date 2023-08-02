package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import encapsulation.LoginPage;

public class ListLoginMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void Login() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	LoginPage1 l=new LoginPage1(driver);
	l.setLogin("admin1", "manager1");
	Thread.sleep(3000);
	l.setLogin("admin", "manager");
	}
}
