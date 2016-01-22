package frontend.tests;

import java.util.concurrent.TimeUnit;



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


public class BlogPageValidation {
	
	private WebDriver driver;
	private String baseUrl;
	
	 
	 @BeforeClass
	  public void beforeClass() {
		  driver = new FirefoxDriver();
		  baseUrl = "http://blog.myplanet.com";
		  
		  //Maximize the browser's window
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  driver.get(baseUrl);
	  }
	 
	 
	 // To see if EmailField appears when you hover over the SubscribeButton
	 @Test
	 public void verifyEmailField() {
		 
		 WebElement EmailField = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[1]/span[3]/form/input"));
		 WebElement SubscribeButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[1]/span[3]/form/button"));
		 
		 Actions action = new Actions(driver);
		 action.moveToElement(SubscribeButton).build().perform();
		 String text = EmailField.getCssValue("style");
		 if (text == "background: transparent none repeat scroll 0% 0%;")
		 {
			 System.out.println("Email field appears on hovering over the Subcribe button");
		 }
	 }
		 
	 
	 
	 
		 //To verify if the Read More button background color changes when you hover over it
		 @Test
		 public void verifyReadMore(){
			 
			 WebElement ReadMoreButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/a"));
			 String text2 = ReadMoreButton.getCssValue("background-color");
			 
			 Actions action = new Actions(driver);
			 action.moveToElement(ReadMoreButton).build().perform();
			 String text3 =ReadMoreButton.getCssValue("background-color");
			 if(text2 != text3)
			 {
				 System.out.println("Read More button's background color changes on hover");
			 }
			 else
			 {
				 System.out.println("Test failed");
			 }
		 }
		 
		 
		 
			 //To verify if Social Media icons appear on hovering the Share Article Element
			 @Test
			 public void verifyShareArticle()
			 {
				 String articleUrl = "http://blog.myplanet.com/stop-building-features-start-crafting-experience";
				 driver.get(articleUrl);
				 WebElement ShareArticleButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/label/span"));
				 
				 Actions action = new Actions(driver);
				 action.moveToElement(ShareArticleButton).build().perform();
				 
				 if(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/label/ul/li[1]/a")).isDisplayed())
				 {
					 System.out.println("Linkedin icon is displayed");
				 }
				 else
				 {
					 System.out.println("Linkedin icon is not displayed");
				 }
				 
				 if(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/label/ul/li[3]/a")).isDisplayed())
				 {
					 System.out.println("Facebook icon is displayed");
				 }
				 else
				 {
					 System.out.println("Facebook icon is not displayed");
				 }
				 
				 if(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/label/ul/li[2]/a")).isDisplayed())
				 {
					 System.out.println("Twitter icon is displayed");
				 }
				 else
				 {
					 System.out.println("Twitter icon is not displayed");
				 }
				 
				 if(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/label/ul/li[4]/a")).isDisplayed())
				 {
					 System.out.println("Email icon is displayed");
				 }
				 else
				 {
					 System.out.println("Email icon is not displayed");
				 }
				 
				 
				 
			 }
				

	 
	 
	 
	 @AfterClass
	  public void afterClass() {
		 driver.quit();
	  }
}
