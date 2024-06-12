import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Student{
    private String status;
    private PropertyChangeSupport support;

    public Student() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void setStatus(String status) {
        support.firePropertyChange("news", this.status, status);
        this.status = status;
    }
}
