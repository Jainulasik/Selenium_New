package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();

		driver.findElement(By.id("accept")).click();
		Thread.sleep(3000);
        Alert aa = driver.switchTo().alert();
		aa.accept();


		driver.findElement(By.xpath("//*[text()='Confirm Alert']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.dismiss();


		driver.findElement(By.xpath("//*[text()='Prompt Alert']")).click();
		Thread.sleep(2000);
		
		Alert s = driver.switchTo().alert();
		s.sendKeys("1234");
		s.accept();

	}






}
