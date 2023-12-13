package priority;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1)
    public void TestCaseD(){
        System.out.println("Test Case D");
    }
    @Test(priority = 1)
    public void TestCaseA(){
        System.out.println("Test Case A");
    }
    @Test(priority = 1)
    public void TestCaseN(){
        System.out.println("Test Case N");
    }
    @Test(priority = 1)
    public void TestCaseB(){
        System.out.println("Test Case B");
    }
    @Test(priority = 1)
    public void TestCaseW(){
        System.out.println("Test Case W");
    }
}
