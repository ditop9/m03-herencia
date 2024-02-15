package ex_2.vehicles_carrega;

import ex_2.Vehicle;

public class VehiclesCarrega extends Vehicle {
    private double pma;
    public VehiclesCarrega(String matricula, int diesLloguer, double pma) {
        super(matricula, diesLloguer);
        this.pma = pma;
    }
    @Override
    public double calcularPreu() {
        return super.calcularPreu() * (20 * pma);
    }
}
