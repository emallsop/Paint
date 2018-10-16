package com.qa.drawing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draw {
public WebDriver driver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}
	
	@Test
	public void draw() {
		Actions action = new Actions(driver);
		
		driver.get("https://www.youidraw.com/apps/painter/");
		action.moveByOffset(300,300).clickAndHold().moveByOffset(100,0).release().perform();
		action.moveByOffset(300,300).clickAndHold().moveByOffset(0,200).release().perform();


	}


}
