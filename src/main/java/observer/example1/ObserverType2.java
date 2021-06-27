package observer.example1;

public class ObserverType2 implements Observer{

    String nameOfObserver;

    public ObserverType2(String name) {
        this.nameOfObserver = name;
    }

    @Override
    public void update(int updatedValue) {
        System.out.println(nameOfObserver + " has received an alert: Updated myValue in Subject is: " + updatedValue);
    }
}
