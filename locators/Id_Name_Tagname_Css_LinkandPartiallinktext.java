package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Name_Tagname_Css_LinkandPartiallinktext {



	public static void main(String[] args) {


		System.setProperty("webdrover.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium_\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");


		//ID 

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("asi");

		//NAME

		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("54321");

		//        WebElement butn = driver.findElement(By.name("login"));		
		//        butn.click();

		// TAGNAME
		
		WebElement tag = driver.findElement(By.tagName("h2"));
		String text = tag.getText();
		System.out.println(text);

		//LINKTEXT
		WebElement linktext = driver.findElement(By.linkText("Voting Information Centre"));
		linktext.click();

		driver.navigate().back();

		//PARTIAL LINK TEXT
		WebElement partial = driver.findElement(By.partialLinkText("Voting"));
		String text2 = partial.getText();
		System.out.println(text2);

		
		//CSS SELECTOR
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("asdf");
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("1258");
		













	}










}
