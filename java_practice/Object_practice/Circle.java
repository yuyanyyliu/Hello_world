package java_practice.Object_practice;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        //super("white", 1.0);已经初始化了
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double findArea(){
        return Math.PI*getRadius()*getRadius();
    }
    //
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Circle){
            Circle c = (Circle)obj;
            return this.radius == c.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    //public String toString(){
     //   return "the radius is "+ getRadius();
    //}

}
