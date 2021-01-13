package SingletonTest;

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
