public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Group group1 = new Group("Группа 1");
        Group group2 = new Group("Группа 2");

        student.setStatus("Статус 1");

        student.addPropertyChangeListener(group1);
        student.addPropertyChangeListener(group2);

        student.setStatus("Статус 2");

        student.removePropertyChangeListener(group1);

        student.setStatus("Статус 3");
    }
}