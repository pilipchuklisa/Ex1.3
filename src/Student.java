import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Observer> observers;
    private String status;

    public Student() {
        this.observers = new ArrayList<>();
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        observers.forEach((observer)-> observer.update(status));
    }
}
