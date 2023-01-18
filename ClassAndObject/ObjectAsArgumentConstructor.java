/* public class ObjectAsArgumentConstructor {
    public static void main(String [] args){
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(c1);
        System.out.println("Area of circle is : " + c2.area());
    }
    
}
class Circle{
    private double radius;
    Circle(){
        radius = 0.0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(Circle ob){
        radius = ob.radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
} */

/* //calling constructor from another constructor using this
public class ObjectAsArgumentConstructor {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Area of circle : " + c1.area());
    }

}

class Circle {
    private double radius;

    Circle() {
        this(10);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
} */

// passing object to method
class Circle {
    private double radius;
    Circle() {
        radius = 0.0;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return 3.14 * radius * radius;
    }
}
public class ObjectAsArgumentConstructor {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        calcArea(c1);
    }
    public static void calcArea(Circle c) {
        System.out.println("Area of circle : " + c.area());
    }
}