package navigateinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.close();
    }
}
