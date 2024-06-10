package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        
        driver.switchTo().frame(0);

        WebElement cusID = driver.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input"));
        cusID.sendKeys("12345678");

        driver.navigate().to("https://letcode.in/frame");
        driver.switchTo().frame(0);
        driver.findElement(By.name("fname")).sendKeys("jainul");
        driver.findElement(By.name("lname")).sendKeys("asik");
        
        driver.switchTo().parentFrame();
        
        driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[1]/a[2]")).click();
        
        
        
        
        
		
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
