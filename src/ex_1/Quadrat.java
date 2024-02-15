package ex_1;

import java.awt.*;

public class Quadrat extends ObjecteGeometric {
    private double costat;
    public double calcularPerimetre() {
        return costat * 4;
    }
    public double calcularArea() {
        return costat * costat;
    }
    public Quadrat(float coordX, float coordY, Color color, float costat) {
        super(coordX, coordY, color);
        this.costat = costat;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "costat=" + costat +
                "} " + super.toString();
    }
}
