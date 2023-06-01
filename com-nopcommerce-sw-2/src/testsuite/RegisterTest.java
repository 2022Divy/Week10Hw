package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void test1() {

        //click on the ‘Register’ link
        WebElement registerLink = driver.findElement(By.className("ico-register"));
        registerLink.click();

        //Verify the text ‘Register’
        WebElement registertext = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        String actualMessage = registertext.getText();
        String expectedMessage = "Register";
        Assert.assertEquals("Verifying text Register", expectedMessage, actualMessage);
    }
    public void text2(){
        //click on the ‘Register’ link
        WebElement registerLink = driver.findElement(By.className("ico-register"));
        registerLink.click();
        //Select gender radio button

    }
}