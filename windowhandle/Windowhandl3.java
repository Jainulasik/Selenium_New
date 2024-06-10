package com.windowhandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandl3 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.in");

	//SELL 

	WebElement Seller = driver.findElement(By.xpath("//a[text()='Sell']"));
	Actions sell = new Actions (driver);
	sell.contextClick(Seller).build().perform();

	Robot rob = new Robot();
	rob.keyPress(KeyEvent.VK_PAGE_DOWN);
	rob.keyPress(KeyEvent.VK_ENTER);



	//BEST SELLERS

	WebElement bestsell = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
	Actions best = new Actions(driver);
	best.contextClick(bestsell).build().perform();

	Robot rob2 = new Robot();
	rob2.keyPress(KeyEvent.VK_PAGE_DOWN);
	rob2.keyPress(KeyEvent.VK_ENTER);

	// MOBILES 

	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	Actions mob = new Actions(driver);
	mob.contextClick(mobile).build().perform();

	Robot rob3 = new Robot();
	rob3.keyPress(KeyEvent.VK_PAGE_DOWN);
	rob3.keyPress(KeyEvent.VK_ENTER);


	//TODAY  DEALS

	WebElement deals = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[5]"));
	Actions dea = new Actions(driver);
	dea.contextClick(deals).build().perform();

	Robot rob4 = new Robot();
	rob4.keyPress(KeyEvent.VK_PAGE_DOWN);
	rob4.keyPress(KeyEvent.VK_ENTER);


	//ELECTRONICS

	WebElement elec = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	Actions ele = new Actions(driver);
	ele.contextClick(elec).build().perform();

	Robot rob5 = new Robot();
	rob5.keyPress(KeyEvent.VK_PAGE_DOWN);
	rob5.keyPress(KeyEvent.VK_ENTER);

	
	//ALL GUID 

	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	
	
	//SWITCH TO ALL TAB 

	for (String ab : windowHandles) {
		
		System.out.println(ab);
		Thread.sleep(2000);
		driver.switchTo().window(ab);
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	
	
	for (String ab:windowHandles) {
		driver.switchTo().window(ab);
		String expectedTitle = "Amazon.in Bestsellers: The most popular items on Amazon";
        String Actualtitle = driver.getTitle();
		Thread.sleep(2000);
		if (expectedTitle.equals(Actualtitle)) {
			break;
		}


	}
	}
}
	
