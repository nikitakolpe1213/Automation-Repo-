package paramterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class DataProviderWithExcelFile {
 //   public static WebDriver driver;
    @DataProvider(name = "TestData")
    public Object[][] dataProviderFun() throws FileNotFoundException {
        Object[][] arrObj = getExcelFile("C:/Users/USER/Desktop/nikita/TestData.xlsx","TestCase1");
        return arrObj;
    }
    public String[][] getExcelFile(String filePath,String sheetName) throws FileNotFoundException {
        String[][] data = null;
        FileInputStream fileInputStream=null;
        XSSFWorkbook wb=null;
        try{
            fileInputStream = new FileInputStream(filePath);

        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            assert fileInputStream != null;
            wb = new XSSFWorkbook(fileInputStream);
        }catch (Exception e){
            e.printStackTrace();
        }

        assert wb != null;

        XSSFSheet sheet = wb.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfColumn = row.getLastCellNum();

        Cell cell;
        data = new String[noOfRows - 1][noOfColumn];

        for (int i = 1; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumn; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i - j][j] = cell.getStringCellValue();
            }
        }
        return data;
    }
       /* @Parameters({"browserName"})
         @BeforeMethod
        public void beforeMethodExample(String browserName){
            if(browserName.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\USER\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe\"");
                 driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "\"C:\\\\Users\\\\USER\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe\"");
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "\"C:\\\\Users\\\\USER\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe\"");
                driver = new EdgeDriver();
            }else {
                throw new RuntimeException("Please select the correct browser");
            }

    }
   /* @Test(dataProvider = "TestData")
    public void verifyGoogleWebsite1(String courseName,String cityName) throws InterruptedException {
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement nameElement = driver.findElement(By.name("q"));
        nameElement.sendKeys(courseName + " " + cityName);
        nameElement.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    } */
  @Test
  public void verifySearchValidCourseNameWithCity(String courseName,String cityName) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
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


