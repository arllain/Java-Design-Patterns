package singleton;

public final class Captain {

    private static  Captain captain;

    // Constructor is private to prevent the use of "new"
    private Captain(){}

    public static synchronized Captain getInstance(){
        // Lazy initialization
        if (captain == null) {
            captain = new Captain();
            System.out.println("New captain instance");
        }else {
            System.out.println("You already have a captain for your team.");
        }
        return captain;
    }

}
