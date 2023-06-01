package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "https://www.saucedemo.com/";

    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void Test1(){
        //Enter “standard_user” username
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("standard_user");

        //Enter “secret_sauce” password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");

        //Click on ‘LOGIN’ button
        WebElement loginButton = driver.findElement(By.linkText("login-button"));
        loginButton.click();

        //Verify the text “PRODUCTS”
        WebElement findText = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));

        String actualWord = findText.getText();
        String expectedWord = "Products";
        Assert.assertEquals("Verify text Product",expectedWord, actualWord);
    }
    public void Test2(){
        //Enter “standard_user” username
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("standard_user");

        //Enter “secret_sauce” password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");

        //Click on ‘LOGIN’ button
        WebElement loginButton = driver.findElement(By.linkText("login-button"));
        loginButton.click();

        //Verify the text “PRODUCTS”

    }


    @After
    public void teardown(){
        closeBrowser();
    }

}
