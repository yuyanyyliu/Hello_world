package TemplateTest;

public class TemplateTest {
    
}

abstract class Template{
    public void spendtime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("The consume time is "+ (end-start));
    }

    public abstract void code();
}