package paramterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationWithDataProvider {
    @DataProvider(name = "testData")
    public Object[][] dataProviderFun(){
        return new Object[][]{{"java","nashik"},{"selenium","Pune"},{"pythone","mumbai"}};
    }
    @Test(dataProvider="testData")
    public void verifySearchValidCourseNameWithCity(String courseName,String cityName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.google.com/");
        driver.manage().window().maximize();
        WebElement textBoxElement = driver.findElement(By.name("q"));
        textBoxElement.sendKeys(courseName + " " + cityName);
        textBoxElement.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
