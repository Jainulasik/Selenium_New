package com.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardInteraction {


	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");

	    Robot r = new Robot();
	    
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_7);
	    
	    Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        
	    Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_TAB);
        
        driver.findElement(By.xpath("//textarea[@title='Search']")).click();
        
	    Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        
	    Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_BACK_SPACE);
	    













	}













}
