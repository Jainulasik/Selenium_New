package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		
		//CLICK
        Actions ac = new Actions(driver);
		Thread.sleep(3000);
		WebElement singleclick = driver.findElement(By.xpath("(//input[@autocorrect='off'])[1]"));
		ac.click(singleclick);
		
		Thread.sleep(2000);

		//RIGHTCLICK
		WebElement rightclick = driver.findElement(By.xpath("//input[@type='password']"));
		ac.contextClick(rightclick).perform();
		
		driver.navigate().to("https://www.myntra.com");
		
		Thread.sleep(2000);

		//MOVETOELEMENT
		WebElement mousehover = driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
		ac.moveToElement(mousehover).perform();
		
		WebElement hoverclick = driver.findElement(By.xpath("//a[text()='Blazers & Coats']"));
		ac.moveToElement(hoverclick).perform();
		hoverclick.click();
		
		//DRAG&DROP
		
        driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		ac.dragAndDrop(drag, drop).perform();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
