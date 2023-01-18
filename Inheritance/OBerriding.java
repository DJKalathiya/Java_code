/* public class OBerriding {
    public static void main(String [] args){
        B b = new B(1, 2, 3);

        b.show("This is k : ");
        b.show();
    }
}
class A{
    int i,j;
    A(int a, int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("I and j is "+ i + " " + j);
    }
}
class B extends A{
    int k;
    B(int a, int b, int c){
        super(a,b);
        k = c;
    }
    void show(String msg){
        System.out.println(msg + " " + k);
    }
} */

// using super to call overriding 
public class OBerriding {
    public static void main(String [] args){
        B b = new B(1, 2, 3);

        b.show();
    }
}
class A{
    int i,j;
    A(int a, int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("I and j is "+ i + " " + j);
    }
}
class B extends A{
    int k;
    B(int a, int b, int c){
        super(a,b);
        k = c;
    }
    void show(String msg){
        super.show();
        System.out.println("k  : " + k);
    }
}