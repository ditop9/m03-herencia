package ex_6;

public class Repartidor extends Empleat{
    private String zonaRepart;

    public Repartidor(String zonaRepart) {
        this.zonaRepart = zonaRepart;
    }
    public String getZonaRepart() {
        return zonaRepart;
    }

    public void setZonaRepart(String zonaRepart) {
        this.zonaRepart = zonaRepart;
    }
    public Repartidor() {

    }
    public Repartidor(String nom, int edad, double salari, String zonaRepart) {
        super(nom, edad, salari);
        this.zonaRepart = zonaRepart;
    }

}
