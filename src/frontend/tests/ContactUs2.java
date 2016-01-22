package frontend.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUs2 {
     public static WebElement element = null;
 
     /* Returns the first name text box element*/
         public static WebElement firstNameTextBox(WebDriver driver){
    	 element = driver.findElement(By.id("firstname-3957c53b-2d57-438d-8a8f-dd2f3e38076e"));
    	 return element;
     }
    
     /* Fills the First Name text box */
         public static void fillFirstNameTextBox(WebDriver driver, String firstName){
    	 element = firstNameTextBox(driver);
    	 element.sendKeys(firstName);
     }
 
         /* Returns the Last Name text box element*/
         public static WebElement lastNameTextBox(WebDriver driver){
        	 element = driver.findElement(By.id("lastname-3957c53b-2d57-438d-8a8f-dd2f3e38076e"));
        	 return element;
         }
                  
         public static WebElement getTextBox(WebDriver driver, String id) {
        	 element = driver.findElement(By.id(id));
        	 return element;
         }
 
         /* Fills the Last Name text box */
         public static void fillLastNameTextBox(WebDriver driver, String lastName){
    	 element = lastNameTextBox(driver);
    	 element.sendKeys(lastName);
     }  
       
         /* Returns the Email text box element*/
         public static WebElement emailTextBox(WebDriver driver){
    	 element = driver.findElement(By.id("email-3957c53b-2d57-438d-8a8f-dd2f3e38076e"));
    	 return element;
     }
 
         /* Fills the Email text box */
         public static void fillEmailTextBox(WebDriver driver, String email){
    	 element = emailTextBox(driver);
    	 element.sendKeys(email);
     } 
         
         /* Returns the Phone text box element*/
         public static WebElement phoneTextBox(WebDriver driver){
    	 element = driver.findElement(By.id("phone-3957c53b-2d57-438d-8a8f-dd2f3e38076e"));
    	 return element;
     }
         
         /* Fills the Phone text box */
         public static void fillPhoneTextBox(WebDriver driver, String phone){
    	 element = phoneTextBox(driver);
    	 element.sendKeys(phone);
     } 
         
         /* Returns the Company Name text box element*/
         public static WebElement companyNameTextBox(WebDriver driver){
    	 element = driver.findElement(By.id("company-3957c53b-2d57-438d-8a8f-dd2f3e38076e"));
    	 return element;
     }
         
         /* Fills the Company Name text box */
         public static void fillCompanyNameTextBox(WebDriver driver, String companyName){
    	 element = companyNameTextBox(driver);
    	 element.sendKeys(companyName);
     }   
         
         /* Returns the Project Details text box element*/
         public static WebElement projectDetailsTextBox(WebDriver driver){
    	 element = driver.findElement(By.id("message-3957c53b-2d57-438d-8a8f-dd2f3e38076e"));
    	 return element;
     }
         
         /* Fills the Project Details text box */
         public static void fillProjectDetailsTextBox(WebDriver driver, String projectDetails){
    	 element = projectDetailsTextBox(driver);
    	 element.sendKeys(projectDetails);
     }   
         
         
        	 
}