package ex_2;

public class Vehicle {
    private String matricula;
    private int diesLloguer;

    public String getMatricula() {
        return matricula;
    }

    public int getDiesLloguer() {
        return diesLloguer;
    }

    public Vehicle(String matricula, int diesLloguer) {
        this.matricula = matricula;
        this.diesLloguer = diesLloguer;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "matricula='" + matricula + '\'' +
                '}';
    }
    public double calcularPreu() {
        return 10 * diesLloguer;
    }
}
