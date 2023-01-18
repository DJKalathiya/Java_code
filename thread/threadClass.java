class threadClass{
    public static void main(String [] args){
        A a1 = new A("Darshan");
        A a2 = new A("kalathiya");
        A a3 = new A("Jayantibhai");

        a1.start();
        a2.start();
        a3.start();

        System.out.println("Hello Dj Kalathiya");
    }
}
class A extends Thread{
    public A(String s){
        super(s);
    }
    public void run(){
        for(int i=1; i<=15; i++){
            System.out.println(getName());
        }
    }
}
