package observer.example1;

public interface SubjectInterface {

    void register(Observer anObserver);
    void unregister(Observer anObserver);
    void notifyRegisterdUsers(int notifiedValue);
}
