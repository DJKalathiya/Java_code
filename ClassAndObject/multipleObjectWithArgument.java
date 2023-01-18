/* public class multipleObjectWithArgument {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
    

        b1.height = 10;
        b1.width = 15;
        b1.depth = 20;

        b1.Volume();
    }
}

class Box {
    double height;
    double width;
    double depth;

    void Volume() {
        System.out.print("Volume is : ");
        System.out.println(width * height * depth);
    }
} */
// method with return value 
public class multipleObjectWithArgument {
    public static void main(String[] args) {
        Box b1 = new Box();
        double vol;

        b1.height = 10;
        b1.width = 15;
        b1.depth = 20;

        vol = b1.Volume();
        System.out.print("Volume is : " +vol);
    }
}

class Box {
    double height;
    double width;
    double depth;

    double Volume() {
        
        return width * height * depth;
    }
}