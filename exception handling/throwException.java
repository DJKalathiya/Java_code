public class throwException {
    static void democ(){
        try{
            throw new NullPointerException("Demo");
        }
        catch(NullPointerException e){
            System.out.println("caught inside democ");
            throw e;
        }
    }
    public static void main(String [] args){
        try{
            democ();
        }
        catch(NullPointerException e){
            System.out.println("Recaught : " + e);
        }
    }
}
