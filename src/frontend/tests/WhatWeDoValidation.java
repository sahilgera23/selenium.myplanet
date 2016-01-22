package frontend.tests;

import frontend.tests.WhatWeDo;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class WhatWeDoValidation {
	private WebDriver driver;
	private String baseUrl;
	
	 @BeforeClass
	  public void beforeClass() {
		  driver = new FirefoxDriver();
		  baseUrl = "https://www.myplanet.com/tags/company";
		  
		  //Maximize the browser's window
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(baseUrl);
	  }
	 
	 @Test
	 public void HeaderText() {
		 WebElement HeaderText = driver.findElement(By.xpath(".//*[@id='banner']/div/h2"));
		 
		 String opacity = HeaderText.getCssValue("opacity");
		 float output = Float.parseFloat(opacity); 

		 System.out.println(HeaderText.getCssValue("opacity").getClass());
		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
		 
	 }

}
