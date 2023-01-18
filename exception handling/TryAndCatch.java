import javax.swing.plaf.synth.SynthOptionPaneUI;

class TryAndCatch{
    public static void main(String [] args){
        int d,a;
        try{
            d=0;
            a = 10/d;
            System.out.println("not printn");
        }
        catch(ArithmeticException e){
            System.out.println("not divide by zero");
        }
        System.out.println("After catch");
    }
}