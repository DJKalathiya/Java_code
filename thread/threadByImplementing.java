public class threadByImplementing {
    public static void main(String [] args){
        A a = new A();
        
        Thread t1 = new Thread(a ,"Darshan");
        Thread t2 = new Thread(a, "Kalathiya");
        Thread t3 = new Thread(a ,"jayantibhai");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("hello DJ Kalathiay\n");
    }
}
class A implements Runnable{
    public void run(){
        for(int i=0; i<=15; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
