package ex_3;

public class InternationalStudent extends Student{
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public InternationalStudent(String name, String address, String cycle, int course, String country) {
        super(name, address, cycle, course);
        this.country = country;
        System.out.println("Sóc el constructor de la classe InternationalStudent");
    }
}
