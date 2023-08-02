package demo;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MY%20PC/Desktop/naukri.html");
		File f=new File("‪C:\\Users\\MY PC\\Desktop\\Resume.docx");	
		String path = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(path);
	}

}
