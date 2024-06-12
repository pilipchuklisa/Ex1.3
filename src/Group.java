import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Group implements PropertyChangeListener {

    private String name;

    public Group(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setStatus((String) evt.getNewValue());
    }

    public void setStatus(String news) {
        System.out.println(name + " узнала: " + news);
    }
}
