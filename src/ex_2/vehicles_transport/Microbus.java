package ex_2.vehicles_transport;


public class Microbus extends Cotxe {

    public Microbus(String matricula, int diesLloguer, int places) {
        super(matricula, diesLloguer, places);
    }
    @Override
    public double calcularPreu() {
        return super.calcularPreu() + (2 * super.getPlaces());
    }
}
