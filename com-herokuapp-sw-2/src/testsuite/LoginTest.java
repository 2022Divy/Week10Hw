package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void Test1(){
        //Enter “tomsmith” username
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("tomsmith");

        //Enter “SuperSecretPassword!” password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //Click on ‘LOGIN’ button
        WebElement loginButton = driver.findElement(By.linkText(" Login"));
        loginButton.click();

        //Verify the text “Secure Area”
        WebElement findText = driver.findElement(By.xpath("//h2[contains(text(),' Secure Area')]"));

        String actualWord = findText.getText();
        String expectedWord = " Secure Area";
        Assert.assertEquals("Verify text Secure Area",expectedWord, actualWord);
    }
    public void Test2(){
        //Enter “tomsmith1” username
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("tomsmith1");

        //Enter “SuperSecretPassword!” password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //Click on ‘LOGIN’ button
        WebElement loginButton = driver.findElement(By.linkText(" Login"));
        loginButton.click();

        //Verify the error message “Your username is invalid!”
        WebElement findText = driver.findElement(By.xpath("//div[contains(text(),' Your username is invalid!')]"));

        String actualWord = findText.getText();
        String expectedWord = " Your username is invalid! ";
        Assert.assertEquals("Verify errorMessage",expectedWord, actualWord);


    }
    public void Test3(){
        //Enter “tomsmith” username
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("tomsmith");

        //Enter “SuperSecretPassword” password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword");

        //Click on ‘LOGIN’ button
        WebElement loginButton = driver.findElement(By.linkText(" Login"));
        loginButton.click();

        //Verify the error message “Your password is invalid!”
        WebElement findText = driver.findElement(By.xpath("//div[contains(text(),' Your password is invalid!')]"));

        String actualWord = findText.getText();
        String expectedWord = " Your password is invalid! ";
        Assert.assertEquals("Verify errorMessage",expectedWord, actualWord);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
