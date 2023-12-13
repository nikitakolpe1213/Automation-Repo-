package basictestng.annotation;

import org.testng.annotations.*;

public class BeforeClassAfterClassEx {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test Method");
    }
    @BeforeClass
   public void beforClassMethod(){
        System.out.println("Before Class Method");
    }
    @Test
    public void Test1(){

        System.out.println("This is Test case 1");
    }
    @Test
    public void Test2(){

        System.out.println("This is Test case 2");
    }

    @AfterClass
    public void AfterClassMethod(){

        System.out.println("After Class Method");
    }

    @AfterTest
    public void afterTestMethod(){
        System.out.println("After test method");
    }


}
