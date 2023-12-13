package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        WebElement srcEle = driver.findElement(By.xpath("//input[@id ='src']"));
        WebElement allSrcCities =  driver.findElement(By.xpath("//ul[@class = 'sc-dnqmqq eFEVtU']"));
        srcEle.sendKeys("pune");
        Thread.sleep(3000);
        driver.close();
    }
}
