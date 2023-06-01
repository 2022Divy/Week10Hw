package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
 String baseurl = "https://courses.ultimateqa.com/";

 @Before

 public void setup(){ openBrowser(baseurl);}

@Test
    public void test1(){
     //click on the ‘Sign In’ link
    WebElement signinLink = driver.findElement(By.className("header__nav-item header__nav-sign-in"));
    signinLink.click();

    //Verify the text ‘Welcome Back!’
    WebElement welcomeText = driver.findElement(By.xpath("//h2[contains(text(),'Welcome Back!')]"));

    String actualMessage = welcomeText.getText();
    String expectedMessage = "Welcome Back!";
    Assert.assertEquals("Verifying WelcomeMessage", expectedMessage, actualMessage);
}
public void Test2(){
     //click on the ‘Sign In’ link
    WebElement signinLink = driver.findElement(By.className("header__nav-item header__nav-sign-in"));
    signinLink.click();

    //Enter invalid username
    WebElement userNameField = driver.findElement(By.id("Email"));
    userNameField.sendKeys("vidhi123@gmail.com");

    //Enter invalid password
    WebElement passwordField = driver.findElement(By.name("Password"));
    passwordField.sendKeys("12345t");

    //Click on Login button
    WebElement loginButton = driver.findElement(By.linkText("Log in"));
    loginButton.click();

    //Verify the error message ‘Invalid email or password.
    WebElement errorMessage = driver.findElement(By.xpath("//li[contains(text(),'Invalid email or password.')]"));

    String actualMessage = errorMessage.getText();
    String expectedMessage = "Invalid email or password.";
    Assert.assertEquals("Verifying errorMessage", expectedMessage, actualMessage);

}

@After
    public void teardown(){
     closeBrowser();
}
}
