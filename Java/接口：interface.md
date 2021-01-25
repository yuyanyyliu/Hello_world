### 接口：interface

接口使用：

1. 接口使用interface来定义

2. Java中，接口和类是两个并列的结构

3. 如何定义接口：接口中的成员

   - JDK7及以前:只能定义全局常量和抽象方法

     > 全局常量：public  static   final的
     >
     > 抽象方法：public  abstract的

   - JDK8:除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法

4. 接口中不能定义构造器，意味着接口不可以实例化

5. Java开发中，接口通过类去实现（implements）的方式来使用

   如果实现类覆盖了接口中所有的抽象方法，则此实现类就可以实例化

   如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类

6. Java类可以实现多个接口----->弥补了Java单继承的局限性

   格式： class AA extends BB implements CC,DD,EE

7. 接口与接口之间可以继承，而且可以多继承

8. 接口具体使用，体现多态性

9. 接口，实际上可以看做是一种规范



面试题：抽象类与接口有哪些异同？



接口的使用

1. 接口使用上也满足多态性
2. 接口，实际上定义了一种规范
3. 开发中，体会面向接口编程

```java
package USBTest;

public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        Flash flash = new Flash();
        com.transferData(flash);
    }
}

class Computer{
    public void transferData(USB usb){
        usb.start();
        System.out.println("working now");
        usb.stop();
    }
}

interface USB{
    void start();
    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("USB is working");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("USB is stopping");

    }   
}

class Printer implements USB{

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Printer is working");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Printer is stopping");
    }
    
}

```

