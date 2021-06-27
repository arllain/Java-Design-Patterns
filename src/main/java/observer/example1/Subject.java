package observer.example1;

import java.util.ArrayList;
import java.util.List;

public class Subject implements  SubjectInterface{
    private int flag;
    List<Observer> observerList = new ArrayList<Observer>();

    public int getFlag(){
        return  flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notifyRegisterdUsers(flag);
    }

    @Override
    public void register(Observer anObserver) {
        observerList.add(anObserver);
    }

    @Override
    public void unregister(Observer anObserver) {
        observerList.remove(anObserver);
    }

    @Override
    public void notifyRegisterdUsers(int notifiedValue) {
        for(Observer observer: observerList){
            observer.update(notifiedValue);
        }
    }
}
