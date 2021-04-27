package singleton;

public class SingletonPatternExample {
    public static void main(String[] args) {
        System.out.println("*** Singleton Pattern ****");
        Captain captain1 = Captain.getInstance();

        System.out.println("Trying to make another captain");
        Captain captain2 = Captain.getInstance();
        if (captain1 == captain2) {
            System.out.println("captain1 and captain2 are same instance");
        }

    }
}
