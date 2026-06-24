public class Main {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("Logging message");

        if(l1 == l2)
            System.out.println("Only one instance created");
    }
}