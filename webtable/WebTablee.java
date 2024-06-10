package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablee {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		
		System.out.println("**************ALL DATA***********");
		
		List<WebElement> alldata = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		for (int i=0; i<alldata.size(); i++) {
			WebElement all = alldata.get(i);
			String text = all.getText();
			System.out.println(text);
		}
		
		System.out.println("************PARTICULAR DATA**********");
		
		List<WebElement> parti = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[6]/td[3]"));
		
		for (int j=0; j<parti.size(); j++) {
			WebElement particular = parti.get(j);
			String text = particular.getText();
			System.out.println(text);
		}
	
		System.out.println("**************ROW DATA *************");
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]"));
		
		for (int k=0; k<rowdata.size(); k++) {
			WebElement row = rowdata.get(k);
			String text = row.getText();
			System.out.println(text);
		}
		
		
		System.out.println("*******COLOUMN DATA**********");
		
		List<WebElement> coloumn = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/td[3]"));	
		for (int l=0; l<coloumn.size(); l++) {
			WebElement col = coloumn.get(l);
			String text = col.getText();
			System.out.println(text);
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
