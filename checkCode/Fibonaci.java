import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Fibonaci {
    /*
     * public static void main(String[] args) {
     * int n;
     * int arr[] = new int[10];
     * n = 10;
     * arr[0] = 0;
     * arr[1] = 1;
     * for (int i = 2; i < n; i++) {
     * arr[i] = arr[i - 1] + arr[i - 2];
     * }
     * for (int e : arr) {
     * System.out.print(e + " ");
     * }
     * }
     */
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + a);
            c = a + b;
            a = b;
            b = c;
        }
    }

}