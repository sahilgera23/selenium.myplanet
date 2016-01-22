package frontend.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


import frontend.tests.ContactUs2;


public class TestSuite {
  private WebDriver driver;
  private String baseUrl;
  
  
  
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  baseUrl = "https://www.myplanet.com/contact";
	  
	  //Maximize the browser's window
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(baseUrl);
  }
  
  
  @Test
  public void fillContactUs() throws Exception {
	  ContactUs2.fillFirstNameTextBox(driver, "Sahil");
	  ContactUs2.fillLastNameTextBox(driver, "Gera");
	  ContactUs2.fillEmailTextBox(driver, "sahil.gera@myplanet.com");
	  ContactUs2.fillPhoneTextBox(driver, "xxx-xxx-xxxx");
	  ContactUs2.fillCompanyNameTextBox(driver, "Myplanet");
	  ContactUs2.fillProjectDetailsTextBox(driver, "This is Sahil practicing Selenium Java for automated tests");
  }

  @AfterClass
  public void afterClass() {
  }

}