package com.findelement_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone 15",Keys.ENTER);
        
        List<WebElement> alliphone = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone ')]"));
        
        for (int i=0; i<alliphone.size(); i++) {
        	WebElement iphones = alliphone.get(i);
        	String text = iphones.getText();
        	System.out.println(text);
        }


      
        }



}
