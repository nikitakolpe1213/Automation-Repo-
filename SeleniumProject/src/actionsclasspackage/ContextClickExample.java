package actionsclasspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
       // driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        WebElement elementRightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(elementRightClick)
                .perform();
        Thread.sleep(3000);
        driver.close();
    }
    }

