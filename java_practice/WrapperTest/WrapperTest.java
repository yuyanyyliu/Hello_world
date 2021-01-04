package java_practice.WrapperTest;

public class WrapperTest {
    @Test
    public void test1(){
        Object o1 = true? new Integer(1):new Double(2.0);
        System.out.println(o1);
    }
}
