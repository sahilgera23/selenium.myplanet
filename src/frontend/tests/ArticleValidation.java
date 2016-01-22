package frontend.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArticleValidation {

	String url;
	WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() {
		  driver = new FirefoxDriver();
		  url = "https://www.myplanet.com/article/mitel";
		  
		  //Maximize the browser's window
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get(url);
		  
		  JavascriptExecutor jsx = (JavascriptExecutor)driver;
		  jsx.executeScript("window.scrollBy(0,400)", "");
		  
		  driver.navigate().refresh();
		  
		  
		  
//		  if (driver.findElement(By.id("kmab-container-1463-click")).isDisplayed())
//		  {
//			  jsx.executeScript("window.scrollBy(0,200)", "");
//			  if ( driver.findElement(By.id("kmab-container-1460-close")).isDisplayed())
//			  {
//				  driver.findElement(By.id("kmab-container-1460-close")).click();
//			  }
//			  else
//			  {
//				  driver.findElement(By.id("kmab-container-1463-close")).click(); 
//			  }
//	
//		  }
		  
		  
//		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		  jsx.executeScript("window.scrollBy(0,400)", "");
	  }
	 
	 @Test
	 public void contactModal()
	 {
		 WebElement TalkButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div/p[12]/span/span/a"));
		 TalkButton.click();
		 
		 
		 WebElement FirstName = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/fieldset[1]/div[1]/div[2]/input"));
		 FirstName.sendKeys("Sahil");
		 
		 WebElement LastName = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/fieldset[1]/div[2]/div[2]/input"));
		 LastName.sendKeys("Gera");
		 
		 WebElement CompanyEmail = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/fieldset[2]/div[1]/div[2]/input"));
		 CompanyEmail.sendKeys("Myplanet");
		 
		 WebElement Phone = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/fieldset[2]/div[2]/div[2]/input"));
		 Phone.sendKeys("123-456-7890");
		 
		 WebElement ProjectDetails = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/fieldset[4]/div/div[2]/textarea"));
		 ProjectDetails.sendKeys("This is an automated test by Sahil");
		 
	 }
		 
		 @AfterClass
		  public void afterClass() {
			 driver.quit();
		 }
		
		 
	 }
	 
	

