package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingPropertyFile {
	static {
		System.setProperty("webdrivre.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		FileInputStream fis=new FileInputStream("./data/commondata.Property");
		Properties p=new Properties();
	p.load(fis);
		String url = p.getProperty("url");
		//driver.findElement(by.)
		System.out.println(url);
		
		
		
	}

}
