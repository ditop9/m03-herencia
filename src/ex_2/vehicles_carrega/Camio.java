package ex_2.vehicles_carrega;

public class Camio extends Furgoneta{

    public Camio(String matricula, int diesLloguer, double pma) {
        super(matricula, diesLloguer, pma);
    }
    @Override
    public double calcularPreu() {
        return super.calcularPreu() + 40;
    }
}
