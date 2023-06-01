package testsuite;

import browserfactory.Basetest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends Basetest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setup(){
        openBrowser(baseurl);
    }

    @Test

    public void test1() {


        //click on the ‘Forgot your password’ link
        WebElement forgotLink = driver.findElement(By.className("orangehrm-login-forgot"));
        forgotLink.click();

        //Verify the text ‘Forgot Your Password?’
        WebElement passwordText = driver.findElement(By.xpath("//p[contains(text(),'Forgot your password? ')]"));
        String actualMessage = passwordText.getText();
        String expectedMessage = "Forgot your password? ";
        Assert.assertEquals("Verifying text ", expectedMessage, actualMessage);
    }

    @After
    public void teardown(){
        closeBrowser();
    }

    }
