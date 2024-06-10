package com.select;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:www.facebook.com");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.id("day"));
		
		Select s = new Select(date);
		s.selectByIndex(23);
		
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select ss = new Select(month);
        ss.selectByValue("6");

		WebElement year = driver.findElement(By.id("year"));
		Select sss = new Select(year);
		sss.selectByVisibleText("1998");
//

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
