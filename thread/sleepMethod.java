public class sleepMethod {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        t.start();
    }
}

class ThreadDemo extends Thread {
    int i = 1;

    public void run() {
        while (i <= 10) {
            System.out.println("i ::: " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
            i++;
        }
    }
}
