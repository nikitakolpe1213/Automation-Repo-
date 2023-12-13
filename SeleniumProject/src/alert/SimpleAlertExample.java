package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement alertElement = driver.findElement(By.id("alertbtn"));
        alertElement.click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();   //down casting
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
        driver.close();
    }
}
