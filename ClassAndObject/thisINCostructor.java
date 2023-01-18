public class thisINCostructor {
    public static void main(String[] args) {
        Box b1 = new Box(10, 15, 45);
        System.out.print("Volume is : " + b1.volume());
    }
}

class Box {
    private double height;
    private double width;
    private double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

}
