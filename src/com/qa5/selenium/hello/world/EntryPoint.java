package com.qa5.selenium.hello.world;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntryPoint {
	
	private static WebDriver driver; 
	private static String URL = "http://google.com";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\QA5\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.navigate().to(URL);
		String title = driver.getTitle();
	//	driver.quit();
		System.out.println(title);
	}
}
