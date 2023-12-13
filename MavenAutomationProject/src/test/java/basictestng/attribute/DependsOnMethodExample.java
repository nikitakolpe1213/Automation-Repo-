package basictestng.attribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {
    @Test(groups = "smoke")
    public void verifyLogin(){
        System.out.println("Login");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = {"verifyLogin()"})
    public void verifyHomePage(){
        System.out.println("Home Page Verification");
    }
    @Test
    public void verifyCardTransaction(){
        System.out.println("Card Transaction");
    }
}
