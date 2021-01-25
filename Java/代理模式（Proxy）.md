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