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