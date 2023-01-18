interface Ainterface{
    void showA();
}
interface binterface extends Ainterface{
    void showB();
}
class Test implements binterface{
    public void showA(){
        System.out.println("ShowA() of a");
    }
    public void showB(){
        System.out.println("ShowB() of b");
    }
}
class inheritanceIN{
    public static void main(String[] args){
        Ainterface a1 = new Test();
        a1.showA();

        binterface b1 = new Test();
        b1.showA();
        b1.showB();
    }
}