public class setterAndGetter {
    public static void main(String[] args) {
        A ob = new A();
        ob.setMessage("Darshan Kalathiya");
        System.out.println("Welcome to " + ob.getMessage() + "...");
    }
}

class A {
    private String message;

    public void setMessage(String msg) {
        message = msg;
    }

    public String getMessage() {
        return message;
    }
}