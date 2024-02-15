package ex_1;

import java.awt.*;

public class Cercle extends ObjecteGeometric{
    private double radi;
    public double calcularPerimetre() {
        return 2 * Math.PI * radi;
    }
    public double calcularArea() {
        return Math.PI * Math.pow(radi, 2);
    }
    public Cercle(float coordX, float coordY, Color color, float radi) {
        super(coordX, coordY, color);
        this.radi = radi;
    }
    @Override
    public String toString() {
        return "Cercle{" +
                "radi=" + radi +
                "} " + super.toString();
    }
}
