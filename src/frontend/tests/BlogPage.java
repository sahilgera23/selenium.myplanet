package frontend.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BlogPage {
	
	public WebDriver driver;
	

	public WebElement SubscribeButton;
	public WebElement EmailField;
	public WebElement ReadMoreButton;
	public WebElement ShareArticleButton;
	public WebElement LinkedinIcon;
	public WebElement FacebookIcon;
	public WebElement TwitterIcon;
	public WebElement EmailIcon;
	
	
	
	public void definitions(WebDriver driver){
	
	
		SubscribeButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[1]/span[3]/form/button"));
		EmailField = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[1]/span[3]/form/input"));
		ReadMoreButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/a"));
		ShareArticleButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/label/span"));
				
		LinkedinIcon = driver.findElement(By.className("share-channel ico-linkedin"));
		FacebookIcon = driver.findElement(By.className("share-channel ico-facebook"));
		TwitterIcon = driver.findElement(By.className("share-channel ico-twitter"));
	    EmailIcon = driver.findElement(By.className("share-channel ico-email"));

}
}