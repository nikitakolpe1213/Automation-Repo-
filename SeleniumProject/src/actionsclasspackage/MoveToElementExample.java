package actionsclasspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//span[text()='✕']"));
        element.click();
        Thread.sleep(3000);
        WebElement element1 = driver.findElement(By.xpath("//span[text()='Fashion']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element1)
                .perform();
        Thread.sleep(3000);
        driver.close();
    }
}
