package demo;

import java.util.HashMap;

public class DataDrivenashmap {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<>();
		hm.put("url", "https://demo.actitime.com/");
		hm.put("username", "admin");
		hm.put("password", "manager");
		System.out.println(hm.get("username"));
		
	}

}
