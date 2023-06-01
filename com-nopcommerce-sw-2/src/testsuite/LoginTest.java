package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
        //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();

        WebElement welcomeMessage = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        String actualMessage = welcomeMessage.getText();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals("Verifying WelcomeMessage", expectedMessage, actualMessage);

    }

    public void test2() {
        //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();

        //Enter valid username
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("vidhi1234@gmail.com");

        //Enter valid password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

        //Click on ‘LOGIN’ button
        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        loginButton.click();

        //Verify the ‘Log out’ text is display
        WebElement logOutMessage = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));

        String actualMessage = logOutMessage.getText();
        String expectedMessage = "Log out";
        Assert.assertEquals("Verifying Logout", expectedMessage, actualMessage);

    }

    public void test3() {
        //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();

        //Enter invalid username
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("vidhi12345@gmail.com");

        //Enter invalid password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456p");

        //Click on ‘LOGIN’ button
        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        loginButton.click();

        //Verify the error message
        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]"));

        String actualMessage = errorMessage.getText();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.";
        Assert.assertEquals("Verifying errorMessage", expectedMessage, actualMessage);
    }
    @After
    public void teardown(){
        closeBrowser();
    }
}