public class CircleTest{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4);

        System.out.println("c1 id is " + c1.getId());
        System.out.println("c2 id is " + c2.getId());
        System.out.println("c2 id is " + c3.getId());

        System.out.println("The number of circle is " + Circle.getTotal());
    }

}

class Circle{
    private double radius;
    private int id;//自动赋值

    public Circle(){
        id = init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }
    
    private static int total;
    private static int init = 1001;//static声明的属性被所有对象共享

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }
    
}