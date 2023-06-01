package testsuite;

import browserfactory.Basetest;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends Basetest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){
        openBrowser(baseurl);
    }

    @Test

    public void test1() {
        //Enter “Admin” username
        WebElement nameField = driver.findElement(By.id("username"));
        nameField.sendKeys("Admin");

        //Enter “admin123 password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("admin123");

        //Click on ‘LOGIN’ button
        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        loginButton.click();

        //Verify the ‘Add employee’ text is display
        WebElement welcomeMessage = driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]"));

        String actualMessage = welcomeMessage.getText();
        String expectedMessage = "Add Employee";
        Assert.assertEquals("Verifying WelcomeMessage", expectedMessage, actualMessage);

    }
    @After
    public void teardown(){
        closeBrowser();
    }
}