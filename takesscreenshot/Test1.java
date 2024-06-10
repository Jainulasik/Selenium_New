package com.takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File a = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a, new File("C:\\Users\\Lenovo\\Desktop\\Screenshot\\insta.png"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//		File ab = new File ("C:\\Users\\Lenovo\\Documents\\Selenium_\\Screenshot\\insta.png");
//		FileHandler.copy(screenshotAs,ab);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
