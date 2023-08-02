package demo;

import java.util.ArrayList;


public class DataDrivenTesting {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("https://demo.actitime.com/");
		a1.add("admin");
		a1.add("admin@actitime.com");
		a1.add("manager");
		System.out.println(a1.get(3));
		
		
	}


}
