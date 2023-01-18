public class polymorphism {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();

        Rectangle r = new Rectangle();
        s = r;
        s.draw();
        s.draw();

        Triangle t = new Triangle();
        s = t;
        s.draw();
        s.draw();
    }
}

class Shape {
    void draw() {
        System.out.println("Draw shape");
    }
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