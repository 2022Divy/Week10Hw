package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){openBrowser(baseurl);}

    @Test
    public void ex1(){
    //click on the ‘Computers’ Tab
        WebElement computerTab =driver.findElement(By.linkText("Computers "));
        computerTab.click();

    //Verify the text ‘Computers’
        WebElement computersText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));

        String actualText = computersText.getText();
        String expectedText = "Computers ";
        Assert.assertEquals("Verifying Text Computers", expectedText, actualText);
    }
    public void ex2(){
        //click on the ‘Electronics’ Tab
        WebElement electronicsTab = driver.findElement(By.linkText("Electronics "));
        electronicsTab.click();

        //Verify the text ‘Electronics’
        WebElement electronicsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));

        String actualText = electronicsText.getText();
        String expectedText = "Electronics ";
        Assert.assertEquals("Verifying Text Electronics", expectedText, actualText);
    }
    public void ex3(){
        //click on the ‘Apparel’ Tab
        WebElement apparelTab = driver.findElement(By.linkText("Apparel "));
        apparelTab.click();

        //Verify the text ‘Apparel’
        WebElement apparelText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        String actualText = apparelText.getText();
        String expectedText = "Apparel ";
        Assert.assertEquals("Verifying Text Apparel", expectedText, actualText);
    }
    public void ex4(){
        //click on the ‘Digital downloads’ Tab
        WebElement digitalDownloadsTab = driver.findElement(By.linkText("Digital downloads "));
        digitalDownloadsTab.click();
        //Verify the text ‘Digital downloads’
        WebElement digitalDownloadText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']"));
        String actualText = digitalDownloadText.getText();
        String expectedText = "Digital downloads ";
        Assert.assertEquals("Verifying Text Digital downloads", expectedText, actualText);
    }
    public void ex5(){
        //click on the ‘Books’ Tab
        WebElement booksTab = driver.findElement(By.linkText("Books "));
        booksTab.click();
        //Verify the text ‘Books’
        WebElement booksText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
        String actualText = booksText.getText();
        String expectedText = "Books ";
        Assert.assertEquals("Verifying Text Books ", expectedText, actualText);
    }
    public void ex6(){
        //click on the ‘Jewelry’ Tab
        WebElement jewelryTab = driver.findElement(By.linkText("Jewelry "));
        jewelryTab.click();

        //Verify the text ‘Jewelry’
        WebElement jewelryText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
        String actualText = jewelryText.getText();
        String expectedText = "Jewelry ";
        Assert.assertEquals("Verifying Text Jewelry", expectedText, actualText);
    }
    public void ex7(){
        //click on the ‘Gift Cards’ Tab
        WebElement cardTab = driver.findElement(By.linkText("Gift Cards "));
        cardTab.click();
        //Verify the text ‘Gift Cards’
        WebElement giftText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
        String actualText = giftText.getText();
        String expectedText = "Gift Cards ";
        Assert.assertEquals("Verifying Text Gift Cards", expectedText, actualText);

    }
    @After
    public void teardown(){
        closeBrowser();
    }
}



