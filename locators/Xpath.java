package com.locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@autocorrect='off'])[1]")).sendKeys("qwer");
		driver.findElement(By.xpath("(//input[contains(@autocapitalize,'off')])[2]")).sendKeys("987654");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);

		
		driver.get("https://www.twitter.com");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
