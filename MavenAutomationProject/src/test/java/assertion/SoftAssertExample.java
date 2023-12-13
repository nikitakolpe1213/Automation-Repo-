package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void verifyHomePage(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String websiteTitle = driver.getTitle();
        softAssert.assertFalse(driver.findElement(By.xpath("//u[text()='Forgot Password?']")).isDisplayed());
        softAssert.assertEquals(websiteTitle,"Rediffmail","Title of the website should be Rediffmail");
        System.out.println("how are you...");
        softAssert.assertAll();
        driver.close();
    }
}
