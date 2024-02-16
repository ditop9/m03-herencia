package ex_2.vehicles_transport;

import ex_2.Vehicle;

public class Cotxe extends Vehicle {
    private int places;
    private final double tarifa = 1.5;

    public int getPlaces() {
        return places;
    }

    public Cotxe(String matricula, int diesLloguer, int places) {
        super(matricula, diesLloguer);
        this.places = places;
    }

    @Override
    public double calcularPreu() {
        return super.calcularPreu() + ((tarifa * places) * super.getDiesLloguer());
    }
}
