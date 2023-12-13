package basictestng.attribute;

import org.testng.annotations.IAnnotation;
import org.testng.annotations.Test;

public class InvocationCountAttribute {
    @Test(invocationCount = 3)
    public void amazonTest(){
        System.out.println("amazon Test Case");
    }
}
