package InterfaceTest;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Plane plane = new Plane();
        plane.fly();
    }
}

interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;//省略了public static final

    //抽象方法
    public abstract void fly();
    void stop();//省略了public abstract
}

interface Attackable{
    void attack();
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("the plane is flying");
    }

    @Override
    public void stop() {
        System.out.println("The plane stops");
    }
    
}

class Bullet extends Object implements Flyable,Attackable{

    @Override
    public void attack() {
        // TODO Auto-generated method stub

    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub

    }
    
}
