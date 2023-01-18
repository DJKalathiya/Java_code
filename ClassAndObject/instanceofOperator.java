public class instanceofOperator {
    public static void main(String[] args) {
        ABC a = new ABC();
        if (a instanceof ABC) {
            System.out.println("A is instace of class abc");
        } else {
            System.out.println("A is not instace of class abc");
        }
        
    }
}

class ABC {
    ABC() {
        System.out.println("Object is created abc");
    }
}

class XYZ {
    XYZ() {
        System.out.println("Object is created abc");
    }
}