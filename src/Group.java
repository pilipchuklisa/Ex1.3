public class Group implements Observer {

    private String name;

    public Group(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(name + " узнала: " + event);
    }
}
