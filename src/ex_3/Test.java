package ex_3;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Diego", "Carrer 1");
        Teacher teacher = new Teacher("Pablo", "Carrer 2");
        Student student = new Student("Maria", "Carrer 3", "DAM", 1);
        InternationalStudent internationalStudent = new InternationalStudent("Peter", "Carrer 4", "DAW", 2, "EUA");
    }
}
