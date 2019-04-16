package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonlogin {
	   final String x="//span[text()='Hello, Sign in']";
       @FindBy(xpath=x)
       private WebElement signBTN;
       final String xp="//input[@type='email']";
       @FindBy(xpath=xp)
       private WebElement unTB;
       final String xp1="//input[@type='submit']";
       @FindBy(xpath=xp1)
       private WebElement contBTN;
       final String xp4="//input[@type='password']";
       @FindBy(xpath=xp4)
       private WebElement pwTB;
       final String id="signInSubmit";
       @FindBy(id=id)
       private WebElement loginBTN;
       
       
       public Amazonlogin(WebDriver driver){
    	   PageFactory.initElements(driver, this);
       }
       
       public void signIn(){
    	   signBTN.click();
       }
       public void setUN(String un){
    	   unTB.sendKeys(un);
       }
       public void clickCont(){
    	   contBTN.click();
       }
       public void setPWD(String pw){
    	   pwTB.sendKeys(pw);
       }
       public void clickLogin(){
    	   loginBTN.click();
       }
      
       
}
