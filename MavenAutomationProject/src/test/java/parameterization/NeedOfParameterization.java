package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedOfParameterization {
    public static WebDriver driver;
    @Parameters("browserName")
    @BeforeMethod
    public void Beforemethod(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        }
    }
    @Parameters({"username","password"})
    @Test
    public void verifyRediffmailWebsite(String username,String password){
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
       WebElement loginElement = driver.findElement(By.id("login1"));
       loginElement.sendKeys("pawannarote");
       WebElement passwordElement = driver.findElement(By.id("password"));
       passwordElement.sendKeys("P1234");
       driver.close();
    }
}
