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