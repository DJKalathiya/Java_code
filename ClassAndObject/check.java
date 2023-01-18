import java.util.*;
 
public class check {
    public static void main(String[] args) {
        char char1;
        char char2;
        char char3;

        char1 = (char) (65 + Math.random()*25);
        char2 = (char) (65 + Math.random()*25);
        char3 = (char) (65 + Math.random()*25);
        int number = (int) (Math.random() * 9999);

        System.out.println("" + (char) (char1) + (char) (char2) + (char) (char3) + number);
    }
}
