package ex_1;

import java.awt.*;
import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Cercle cercle = new Cercle(1, 1, Color.black, 4);
        double areaCercle = cercle.calcularArea();
        System.out.println("ÀREA DEL CERCLE: " + df.format(areaCercle));
        double perimetreCercle = cercle.calcularPerimetre();
        System.out.println("PERÍMETRE DEL CERCLE: " + df.format(perimetreCercle));
        Quadrat quadrat = new Quadrat(10, 15, Color.blue, 12);
        double areaQuadrat = quadrat.calcularArea();
        System.out.println("ÀREA DEL QUADRAT: " + df.format(areaQuadrat));
        double perimetreQuadrat = quadrat.calcularPerimetre();
        System.out.println("PERÍMETRE DEL QUADRAT: " + df.format(perimetreQuadrat));
    }
}
