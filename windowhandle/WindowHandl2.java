package com.windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandl2 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		driver.manage().window().maximize();

		String parentwin = driver.getWindowHandle();


		driver.findElement(By.xpath("//span[.='Open']")).click();

		Set<String> handles = driver.getWindowHandles();

		for (String win1 : handles) {
			driver.switchTo().window(win1);
		}
		Thread.sleep(3000);
		driver.findElement(By.id("message")).click();
		driver.close();
		
		
		driver.switchTo().window(parentwin);
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[.='Open Multiple']")).click();		
		int numofwindows = driver.getWindowHandles().size();
		System.out.println("Num of win opened " + numofwindows);
		
        Set<String> windowHandles = driver.getWindowHandles();		
        
        for (String Allwindows : windowHandles) {
        	if (!Allwindows.equals(parentwin)) {
        		driver.switchTo().window(Allwindows);
        		driver.close();
        	}
			
		}
        
		Thread.sleep(3000);

 
		driver.findElement(By.xpath("//span[.='Close Windows']")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String Allwindows2 : windowHandles2) {
			if (!Allwindows2.equals(parentwin)) {
				driver.switchTo().window(Allwindows2);
				driver.close();
			}
			
		}
	}
}










