### 代理模式（Proxy）

代理模式是java开发中使用较多的一种设计模式。代理设计就是为其他对象提供一种代理以控制这个对象的访问

```java
package NetWorkTest;

public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxySever proxyServer = new ProxySever(server);
        proxyServer.browse();
    }
    
}

interface NetWork{
    public void browse();
}

//被代理类
class Server implements NetWork{

    @Override
    public void browse() {
        // TODO Auto-generated method stub
        System.out.println("zhen shi fang wen wang luo");
    }
}

//代理类
class ProxySever implements NetWork{
    private NetWork work;

    public ProxySever(NetWork work){
        this.work = work;
    }
    public void check(){
        System.out.println("checking   ");
    }

    @Override
    public void browse() {
        // TODO Auto-generated method stub
        check();
        work.browse();
    }

}
```



### 工厂设计模式

简单工厂模式

工厂方法模式

抽象工厂模式

### java8 新特性

JDK8:除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法

- 接口中定义的静态方法，只能通过接口来调用

- 通过实现类的对象，可以调用接口中的默认方法如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法

- 如果子类（或实现类）继承的父类和实现的接口中声明了同名同参数的方法，那么子类在没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法---->**类优先原则**

- 如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，那么在在实现类没有重写此方法的情况下，报错。----->**接口冲突**，则必须要在实现类中重写此方法

- 如何在子类（实现类）的方法中调用父类，接口中被重写的方法

  ```java
  super.method3();//调用父类中声明的
  CompareA.super.method3();//CompareA 接口
  CompareB.super.method3();
  
  ```

  

