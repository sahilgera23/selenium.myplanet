package frontend.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WhatWeDo {
	
	String url = "https://www.myplanet.com/tags/company";
	
	public WebDriver driver;
	
	WebElement HeaderText = driver.findElement(By.xpath(".//*[@id='banner']/div/h2"));
	
	

}
