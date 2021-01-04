package java_practice.Object_practice;

public class CircleTest {
    public static void main(String[] args) {
        Circle C1 = new Circle(2.3);
        Circle C2 = new Circle(1.0);
        System.out.println("if the color equal " + C1.getColor().equals(C2.getColor()));
        System.out.println("if the radius equal " + C1.equals(C2));
        System.out.println(C1);
        System.out.println(C2.toString());
    }
}
