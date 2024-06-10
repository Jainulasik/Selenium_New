package com.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(1000);
		driver.navigate().to("https://www.twitter.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		driver.get("https://www.amazon.com");
		driver.get("https://www.flipkart.com");
		driver.get("https://www.meesho.com");
		driver.get("https://www.amazon.com");
		
		
}
}
