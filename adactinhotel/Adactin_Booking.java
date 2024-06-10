package com.adactinhotel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Booking {

	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		//LOGIN PAGE
		
		driver.findElement(By.id("username")).sendKeys("Asik232425");
		driver.findElement(By.id("password")).sendKeys("76183E");
		driver.findElement(By.id("login")).click();
		
		//SEARCH HOTELS

		WebElement location = driver.findElement(By.name("location"));
		Thread.sleep(1000);

		Select s = new Select(location);
		s.selectByIndex(7);
		
		
		WebElement hotels = driver.findElement(By.name("hotels"));
		Thread.sleep(1000);

		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");
		
		WebElement Roomtype = driver.findElement(By.name("room_type"));
		Thread.sleep(1000);

		Select s2 = new Select(Roomtype);
		s2.selectByVisibleText("Super Deluxe");
		
		WebElement numofrooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Thread.sleep(1000);

		Select s3 = new Select(numofrooms);
		s3.selectByIndex(3);
		
		WebElement indate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		Thread.sleep(1000);

		indate.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		indate.sendKeys("07/05/2024");
		
		WebElement outdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		Thread.sleep(1000);

		outdate.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		outdate.sendKeys("12/05/2024");
		
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Thread.sleep(1000);

	
		Select s4 = new Select(adult);
		s4.selectByIndex(3);
		
		WebElement childrenrom = driver.findElement(By.name("child_room"));
		Thread.sleep(1000);

		Select s5 = new Select(childrenrom);
		s5.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		//SELECT HOTEL

		
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();
		
		//BOOK A HOTEL
		driver.findElement(By.name("first_name")).sendKeys("ashfi");
		driver.findElement(By.name("last_name")).sendKeys("Zarin");
		driver.findElement(By.name("address")).sendKeys("2/10 West street ,London");
		driver.findElement(By.name("cc_num")).sendKeys("1536247896522564");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cardtype);
		s6.selectByIndex(3);
		
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Thread.sleep(1000);

		Select s7 = new Select(month);
		s7.selectByIndex(5);
		
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByIndex(16);
		
		
		
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		Thread.sleep(1000);

		cvv.sendKeys("1235");
		
		driver.findElement(By.name("book_now")).click();
		
		Thread.sleep(5000);
		
		//BOOKING CONFIRMATION
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();

		
		driver.findElement(By.name("logout")).click();
		
		//TAKESSCREENSHOT
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File a = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(a, new File("C:\\Users\\Lenovo\\Desktop\\Screenshot\\adactin.png"));
		
		
		
		


		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
