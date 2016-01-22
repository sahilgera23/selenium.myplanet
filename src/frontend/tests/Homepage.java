package frontend.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Homepage {
		
    String url = "https://www.myplanet.com/";
	
	public void utilityFunction(WebElement element, String expectedUrl,WebDriver driver) throws Exception
	{
		try {
			element.click();
		} catch(org.openqa.selenium.StaleElementReferenceException exception) {
			element = driver.findElement(By.xpath(element.getAttribute("xpath")));
			System.out.println(element.getAttribute("xpath"));
			element.click();
		}
		Thread.sleep(4000);
		String actualUrl = driver.getCurrentUrl();
		
		if (actualUrl == expectedUrl)
		{
			System.out.println("Link verified"+ element);
		}
		else 
		{
			System.out.println(actualUrl);
		}
		driver.navigate().back();
	}
	
	public WebElement HeaderLogo; 
	public WebElement WhatWeDo; 
	public WebElement Work;
	public WebElement Blog;
	public WebElement Labs;
	public WebElement ContactUs;
	public WebElement Careers;
	public WebElement PhoneNumber;
	public WebElement Email;
	public WebElement Twitter;
	public WebElement Facebook;
	public WebElement Dribble;
	public WebElement Drupal;
	public WebElement Glassdoor;
	public WebElement Linkedin;
	public WebElement PrivacyPolicy;
	public WebElement AccessibilityPolicy;
	
	public Homepage(WebDriver driver) {
		
		HeaderLogo = driver.findElement(By.xpath(".//*[@id='logo']" )); 
		
		WhatWeDo = driver.findElement(By.xpath( ".//*[@id='block-system-main-menu']/div/ul/li[1]/a")); 
		
		Work = driver.findElement(By.xpath(".//*[@id='block-system-main-menu']/div/ul/li[2]/a"));
		
	    Blog = driver.findElement(By.xpath(".//*[@id='block-system-main-menu']/div/ul/li[3]/a"));
		
		Labs = driver.findElement(By.xpath(".//*[@id='block-system-main-menu']/div/ul/li[4]/a"));
		
		ContactUs = driver.findElement(By.xpath(".//*[@id='block-system-main-menu']/div/ul/li[5]/a"));
		
		Careers = driver.findElement(By.xpath(".//*[@id='block-system-main-menu']/div/ul/li[6]/a"));
		
		PhoneNumber = driver.findElement(By.xpath(".//*[@id='page-wrapper']/footer/div/div[1]/div[1]/div[1]/p/a"));
		
		Email = driver.findElement(By.xpath(".//*[@id='page-wrapper']/footer/div/div[1]/div[1]/div[2]/p/a"));
		
		Twitter = driver.findElement(By.xpath(".//*[@id='page-wrapper']/footer/div/ul/li[1]/a/span"));
		
		Facebook = driver.findElement(By.xpath(".//*[@id='page-wrapper']/footer/div/ul/li[2]/a/span"));
		
		Dribble = driver.findElement(By.xpath(".//*[@id='page-wrapper']/footer/div/ul/li[3]/a/span"));
		
		Drupal = driver.findElement(By.xpath(".//*[@id='page-wrapper']/footer/div/ul/li[4]/a/span"));
		
		Glassdoor = driver.findElement(By.xpath(".//*[@id='page-wrapper']/footer/div/ul/li[5]/a/span"));
		
		Linkedin = driver.findElement(By.xpath(".//*[@id='page-wrapper']/footer/div/ul/li[6]/a/span"));
		
		PrivacyPolicy = driver.findElement(By.xpath(".//*[@id='page-wrapper']/footer/div/div[2]/a[1]"));
		
		AccessibilityPolicy = driver.findElement(By.xpath(".//*[@id='page-wrapper']/footer/div/div[2]/a[2]"));
	}
	
		
}
