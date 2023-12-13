package basictestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTestNGExample {
   public WebDriver driver;
  /*  @BeforeMethod
   public void BeforeMethodEx(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }*/
    /*
    @Test(groups = "smoke")
    public void verifyAbhiBusWebsite(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.Abhibus.com/");
        driver.close();
    }

    @Test(groups = "smoke")
    public void verifyEDSOWebsite(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.edso.in/");/* @AfterMethod
    public void AfterMethod(){
        driver.close();
    }*/
}
