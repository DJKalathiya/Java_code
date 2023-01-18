class simple1 {
    public static void main(String[] args) {
        A sup = new A();
        B sub = new B();

        sup.i = 10;
        sup.j = 20;
        sup.showij();

        sub.i = 1;
        sub.j = 2;
        sub.k = 3;
        sub.showij();
        sub.showk();
        sub.sum();
    }
}

class A {
    int i, j;

    void showij() {
        System.out.print("\nI and J is : " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.print("\nK is : " + k);
    }

    void sum() {
        System.out.print("\nSum of i +j+k :" + (i + j + k));
    }
}