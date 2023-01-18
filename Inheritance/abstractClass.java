abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Draw rectangel");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Draw Triangle");
    }
}
public class abstractClass {
    public static void main(String [] args){
        Shape s;

        Rectangle r = new Rectangle();
        s = r;
        s.draw();
    
        Triangle t = new Triangle();
        s = t;
        s.draw();
    }
}
