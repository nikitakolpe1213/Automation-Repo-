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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ParameterizationWithDataProvider1 {

    @DataProvider(name = "testData")
    public Object[][] dataProviderFun() throws IOException {
        Object[][] arrObj=getExcelFile("C:\\Users\\USER\\Desktop\\nikita\\TestData.xlsx","TestCase1");

        return arrObj;
    }
    public String[][] getExcelFile(String filePath,String sheetName) throws IOException {

        String[][] data=null;
        FileInputStream fileInputStream=new FileInputStream(filePath);
        XSSFWorkbook wb=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=wb.getSheet(sheetName);
        XSSFRow row= sheet.getRow(0);
        int noOfRows= sheet.getPhysicalNumberOfRows();
        int noOfColn=row.getLastCellNum();
        Cell cell;
        data =new String[noOfRows][noOfColn];
        for(int i=1;i<noOfRows;i++){
            for(int j=0;j<noOfColn;j++){
                row=sheet.getRow(i);
                cell=row.getCell(j);
                data[i-1][j]=cell.getStringCellValue();
            }
        }


        return data;
    }

    @Test(dataProvider="testData")
    public void verifySearchValidationCourseNameCityName(String CourseName,String CityName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement textBoxElement = driver.findElement(By.name("q"));
        textBoxElement.sendKeys(CourseName +" "+ CityName);
        textBoxElement.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.close();


    }





}
