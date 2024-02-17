package ex_6;

public class Comercial extends Empleat{
    private int comissio;

    public int getComissio() {
        return comissio;
    }

    public void setComissio(int comissio) {
        this.comissio = comissio;
    }

    public Comercial() {

    }

    public Comercial(String nom, int edad, double salari, int comissio) {
        super(nom, edad, salari);
        this.comissio = comissio;
    }
}
