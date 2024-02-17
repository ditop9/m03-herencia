package ex_6;

public class Empleat {
    private String nom;
    private int edad;
    private double salari;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }

    public double getSalari() {
        return salari;
    }
    public boolean plus(int plusSalarial) {
        return getEdad() > 40;
    }
    public boolean comprovaNom() {
        return !getNom().isEmpty();
    }
    public Empleat() {

    }
    public Empleat(String nom, int edad, double salari) {
        this.nom = nom;
        this.edad = edad;
        this.salari = salari;
    }

}
