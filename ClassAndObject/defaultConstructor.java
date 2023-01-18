/* class Circle {
    private double radius;
    Circle() {
        radius = 10.0;
    }
    public double area() {
        return 3.14 * radius * radius;
    }
}
public class defaultConstructor {
    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println("Area is : " + obj.area());
    }
} */
// Parameterized Constructor
class Circle {
    private double radius;

    Circle(double rad) {
        radius = rad;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

public class defaultConstructor {
    public static void main(String[] args) {
        Circle obj = new Circle(10);
        System.out.println("Area is : " + obj.area());
    }
}