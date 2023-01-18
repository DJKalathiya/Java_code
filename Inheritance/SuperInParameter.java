class A {
    int x;
    A(int a) {
        x = a;
        System.out.println("A constructor , x : " + x);
    }
}
class B extends A {
    int y;
    B(int a, int b) {
        super(a);
        y = b;
        System.out.println("B constructor , x : " + y);
    }
}
class C extends B{
    int z;
    C(int a, int b, int c){
        super(a,b);
        z = c;
        System.out.println("C constructor , x : " +z);
    }
}
public class SuperInParameter {
    public static void main(String [] args){
        C x = new C(1,2,3);
    }
}


// calling super class xonstructor using super
/* class A {
    A() {
        System.out.println("A constructor , x : " );
    }
}
class B extends A {
    B() {
        super();
        System.out.println("B constructor , x : ");
    }
}
class C extends B{
    C(){
        super();
        System.out.println("C constructor , x : " );
    }
}
public class SuperInParameter {
    public static void main(String [] args){
        C x = new C();
    }
}
 */