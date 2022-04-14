import org.testng.annotations.Test;
public class TestNG {

    @Test(groups = {"SB"})
    public void func1()
    {
        System.out.println("Function 1 is running");
    }
    @Test(groups={"Sheeza","Bakshi"})
    public void func2()
    {
        System.out.println("Function 2 is running");
    }
    @Test(groups={"Bakshi"})
    public void func3()
    {
        System.out.println("3rd Function");
    }


}