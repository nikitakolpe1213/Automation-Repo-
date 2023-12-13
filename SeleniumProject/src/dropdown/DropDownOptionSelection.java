package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptionSelection {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement DropDownElement = driver.findElement(By.id("carselect"));
        Select select = new Select(DropDownElement);
        Thread.sleep(3000);
        select.selectByValue("benz");
        Thread.sleep(3000);
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByVisibleText("BMW");
        Thread.sleep(3000);
        driver.close();

    }

}
