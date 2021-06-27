package observer.example2;

public class ObserverPatternExample {
    public static void main(String[] args) {
        System.out.println("*** Observer Pattern ***");
        System.out.println("-------------------------");

        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
