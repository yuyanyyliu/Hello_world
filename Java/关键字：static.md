### 关键字：static

static关键字的使用

- static：静态的

- static可以用来修饰：属性，方法，代码块，内部类

- 使用static修饰属性：静态变量（或类变量）

  - 属性，按是否使用static修饰，又分为：静态属性vs非静态属性（实例变量）

    ​	**实例变量**：我们创建了类的多个对象，每个对象都独立的拥有一套类的非静态属性。当修改其中一个非静态属性时，不会导致其他对象中同样的属性值的修改

    ​	**静态变量**：我们创建了类的多个对象，多个对象共享同一个静态变量。当通过某一个对象修改静态变量时，会导致其他对象调用此静态变量时，是修改过了的。

  - static修饰属性的其他说明

    静态变量随着类的加载而加载。可以通过“类.静态变量的方式进行调用”

    静态变量的加载要早于对象的创建

    由于类只会加载一次，则静态变量在内存中也只会存在一份，存在方法区的静态域中

  - 静态属性举例：System.out;  Math.PI

- 使用static修饰方法：静态方法

  随着类的加载而加载，可以通过“类.静态方法”的方式进行调用

  静态方法中，只能调用静态的方法或属性

  非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性

- static注意点：

  在静态的方法内，不能使用this关键字，super关键字

  静态结构中不能调用非静态的结构，可以调用静态的结构，主要原因是因为两者生命周期不同

- 在开发中，如何确定一个属性是否要声明为static？

  - 属性是可以被多个对象所共享的，不会随着对象的不同而不同的

  - 常量也常常声明为static

  在开发中，如何确定一个方法是否声明为static？

  - 操作静态属性的方法，通常设置为static的

  - 工具类中的方法，习惯上声明为static的。比如Math，Arrays，Collections

### 单例设计模式

1. 所谓单例设计模式，就是采取一定的方法保证在整个软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法。

2. 如何实现

   饿汉式 vs 懒汉式

3. 区分饿汉式和懒汉式

   饿汉式：

   ​	坏处：对象加载时间过长

   ​	好处：天然线程安全的

   懒汉式：

   ​	好处：延迟对象的创建

   ​	坏处：目前写法是线程不安全的

```java
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstnce();
        Bank bank2 = Bank.getInstnce();

        System.out.println(bank1 == bank2);
    }
    
}
//恶汉式
class Bank{
    //私有化构造器
    private Bank(){

    }
    //内部创建类的对象
    //此对象也必须声明为静态的
    private static Bank instance = new Bank();
    //提供公共静态的方法，返回类的对象
    public static Bank getInstnce(){
        return instance;
    }
}


public class SingletonTest2 {
    public static void main(String[] args) {
        Order or1 = Order.getInstance();
        Order or2 = Order.getInstance();
        System.out.println(or1 == or2);
    }
}
//懒汉式
class Order{
    //私有化类的构造器
    private Order(){

    }
    //声明当前类对象，没有初始化
    //此时对象也必须声明为static的
    private static Order instance = null;
    //声明Public,static的返回当前类对象的方法
    public static Order getInstance(){
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }

}
```





栈：局部变量

堆：new出来的结构:对象，数组

方法区：类的加载信息，静态域，常量池