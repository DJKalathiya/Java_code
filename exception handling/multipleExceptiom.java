public class multipleExceptiom {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 10 / a;
            int c[] = { 1 };
            c[10] = 100;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught");
        }
        System.out.println("After try and catch");
    }
}
