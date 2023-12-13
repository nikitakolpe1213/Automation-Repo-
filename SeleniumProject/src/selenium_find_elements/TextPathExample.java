package selenium_find_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextPathExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
       // driver.findElement(By.cssSelector("input[id =login1")).sendKeys("Nikita kolpe");
        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        Thread.sleep(5000);
        driver.close();
    }
}

