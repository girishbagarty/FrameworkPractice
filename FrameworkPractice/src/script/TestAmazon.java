package script;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.AmazonExcel;
import generic.BaseAmazon;
import generic.ScreenshotFlipkart;
import page.Amazonlogin;

public class TestAmazon extends BaseAmazon{
       @Test
       public void testflipkart() throws EncryptedDocumentException, FileNotFoundException, IOException{
    	   Reporter.log("test pass",true);
    	   String un = AmazonExcel.getData(path, "sheet1", 1, 0);
    	   String pw = AmazonExcel.getData(path, "sheet1", 1, 1);
    	   Amazonlogin al=new Amazonlogin(driver);
    	   al.signIn();
    	   al.setUN(un);
    	   al.clickCont();
    	   al.setPWD(pw);
    	   al.clickLogin();
    	   ScreenshotFlipkart.getScreenS(driver, "./Screenshots/Amazon.png");
    	   
       }
       
}
