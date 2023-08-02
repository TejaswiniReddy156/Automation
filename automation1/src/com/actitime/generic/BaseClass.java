package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {

	public static WebDriver driver;
	@BeforeClass(groups="smoketest")
	public void OpenBrowser() {
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass(groups="smoketest")
	public void CloseBrowser() {
		Reporter.log("CloseBrowser",true);
		driver.close();
	}
	@BeforeMethod(groups="smoketest")
	public void LogIn() {
		Reporter.log("login",true);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
	
	@AfterMethod(groups="smoketest")
	public void LogOut() {
		Reporter.log("logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}

}
