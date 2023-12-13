package basictestng.attribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableExample {
    public void verifyLogin(){
        System.out.println("Login");
    }
    @Test(enabled = false)
    public void verifyHomePage(){
        System.out.println("Home Page Verification");
    }
    @Test(groups = "smoke")
    public void verifyCardTransaction(){
        System.out.println("Card Transaction");
    }
}
