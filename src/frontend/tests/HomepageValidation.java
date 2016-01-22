package frontend.tests;

import java.util.concurrent.TimeUnit;

import frontend.tests.Homepage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class HomepageValidation {
	 private WebDriver driver;
	 private String baseUrl;
	 
	 @BeforeClass
	  public void beforeClass() {
		  driver = new FirefoxDriver();
		  baseUrl = "https://www.myplanet.com";
		  
		  //Maximize the browser's window
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(baseUrl);
	  }
	 
	 @Test
	 //To see if the sticky header color changes
	 public void HeaderColor() throws Exception {
		 WebElement element = driver.findElement(By.xpath(".//*[@id='page-wrapper']/header"));
		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
		 WebElement element1 = driver.findElement(By.xpath(".//*[@id='page-wrapper']/header[contains(@class,'shrink')]"));
		 String text = element.getCssValue("background-color");
		 String text1 = element1.getCssValue("background-color");
		 if (text != text1)
		 {
			 System.out.println("Headercolor function passes");
		 }
	 }
	 
	 @Test
	 /*To see if the button changes color*/
	 public void buttonColor() {
		 WebElement element = driver.findElement(By.xpath(".//*[@id='banner']/div/div"));
		 String text5 = element.getCssValue("background-color");
		 Actions action = new Actions(driver);
		 action.moveToElement(element).build().perform();
		 String text6 = element.getCssValue("background-color");
		 if (text5 != text6)
		 {
			 System.out.println("Button changes background color");
		 }
		 
	 }
	 
	 @Test
	 /* To see if the dots work*/
	 public void activeDots()  {
		 WebElement element = driver.findElement(By.xpath(".//*[@id='node-1']/div/div[2]/div[2]/ol/li[1]/a"));
		 String text2 = element.getCssValue("background-color");
		 System.out.println(text2);
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String text3 = element.getCssValue("background-color");
		 System.out.println(text3);
		 if (text2 != text3)
		 {
			 System.out.println("Dots are working");
		 }
	 }
	 	 
	 @Test
	 /*To see if the tiles hover action work*/
	 public void tilesHover() {
		 WebElement element = driver.findElement(By.xpath(".//*[@id='node-1']/div/div[1]/div/div/div/div[1]"));
		 
		 Actions action = new Actions(driver);
		 action.moveToElement(element).build().perform();
		 String text4 = element.getCssValue("background-color");
		 if (text4 == "rgba(0, 0, 0, 0.7)")
		 {
			 System.out.println("Hover action works on tiles");
		 }
		 
	 }
	 
	 @Test
	 public void linkVerification() throws Exception
	 {
		Homepage homepage = new Homepage(driver);
		//homepage.utilityFunction(homepage.HeaderLogo, "https://www.myplanet.com/", driver);
		homepage.utilityFunction(homepage.WhatWeDo, "https://www.myplanet.com/tags/company", driver);
		homepage.utilityFunction(homepage.Work, "https://www.myplanet.com/tags/work", driver);
		homepage.utilityFunction(homepage.Blog, "http://blog.myplanet.com/", driver);
		homepage.utilityFunction(homepage.Labs, "https://www.myplanet.com/tags/labs", driver);
		homepage.utilityFunction(homepage.ContactUs, "https://www.myplanet.com/contact", driver);
		//homepage.utilityFunction(homepage.Careers, "https://www.glassdoor.ca/Job/Myplanet-Jobs-E517554.htm", driver);
		//homepage.utilityFunction(homepage.Twitter, "https://twitter.com/myplanetHQ", driver);
		//homepage.utilityFunction(homepage.Facebook, "https://www.facebook.com/myplanetHQ", driver);
		//homepage.utilityFunction(homepage.Dribble, "https://dribbble.com/myplanet", driver);
		//homepage.utilityFunction(homepage.Drupal, "https://www.drupal.org/node/1121200", driver);
		//homepage.utilityFunction(homepage.Glassdoor, "https://www.glassdoor.ca/Overview/Working-at-Myplanet-EI_IE517554.11,19.htm", driver);
		//homepage.utilityFunction(homepage.Linkedin, "https://www.linkedin.com/company/-myplanet-digital", driver);
		//homepage.utilityFunction(homepage.PrivacyPolicy, "https://www.myplanet.com/article/privacy", driver);
		//homepage.utilityFunction(homepage.AccessibilityPolicy, "https://www.myplanet.com/article/accessible-customer-service-policy", driver);
		 
	 }
	 @AfterClass
	  public void afterClass() {
		 driver.quit();
	  }
	 
	 
	 

}
