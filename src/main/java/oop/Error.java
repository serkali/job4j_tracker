package oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.print();
        Error error1 = new Error(true, 5, "Error 404");
        error1.print();
        Error error2 = new Error(false, 4, "No faled");
        error2.print();
        Error error3 = new Error(false, 3, "ERROR");
        error3.print();

    }

    public void print() {
        System.out.println("Message:" + active);
        System.out.println("Message:" + status);
        System.out.println("Message:" + message);
    }
}
