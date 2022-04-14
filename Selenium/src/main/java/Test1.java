import org.testng.annotations.Test;

public class  Test1 {

    @Test(priority = 5)
    public void A()
    {
        System.out.println("Hello World");
    }
    @Test(priority = 3)
    public void B()
    {
        System.out.println("Testing");
    }


}