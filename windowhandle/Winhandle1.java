package com.windowhandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Winhandle1 {

	public static void main(String[] args) throws AWTException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");


		Actions ac = new Actions(driver);
		WebElement rightclick = driver.findElement(By.xpath("//a[.=' Electronics ']"));
		ac.contextClick(rightclick).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);

		Set<String> windowHandles = driver.getWindowHandles();

		Iterator it = windowHandles.iterator();

		String Parentid =  (String) it.next();
		String childid = (String)it.next();

		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//span[.='Accessories']")).click();


		driver.switchTo().window(Parentid);
		driver.findElement(By.xpath("//a[.='Sign in securely']")).click();
















	}}
