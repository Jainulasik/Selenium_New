package com.webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		Thread.sleep(2000);
		//MAXIMIZE
		driver.manage().window().maximize();

		Thread.sleep(2000);

		//DIMENSION
		Dimension di = new Dimension(800, 800);
		driver.manage().window().setSize(di);

		Thread.sleep(2000);

		//POSITION

		Point po = new Point(500, 100);
		driver.manage().window().setPosition(po);
	
        //GETATTRIBUTE

		WebElement passw = driver.findElement(By.id("pass"));
		String attribute = passw.getAttribute("placeholder");
		System.out.println(attribute);
	    
}









}
