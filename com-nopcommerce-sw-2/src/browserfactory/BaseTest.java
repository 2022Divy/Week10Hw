package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String url){
        ChromeOptions options = new ChromeOptions(); //setting webdriver
        driver = new ChromeDriver(options);
        driver.get(url);//launch url
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }

    public void closeBrowser(){
        driver.quit();
    }

}
