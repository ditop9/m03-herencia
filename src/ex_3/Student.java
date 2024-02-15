package ex_3;

public class Student extends Person {
    private String cycle;
    private int course;

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, String address, String cycle, int course) {
        super(name, address);
        this.cycle = cycle;
        this.course = course;
        System.out.println("Sóc el constructor de la classe Student");
    }
}
