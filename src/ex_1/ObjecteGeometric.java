package ex_1;

import java.awt.*;

public class ObjecteGeometric {
    private float coordX;
    private float coordY;
    private Color color;
    public ObjecteGeometric(float coordX, float coordY, Color color) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ObjecteGeometric{" +
                "coordX='" + coordX + '\'' +
                ", coordY='" + coordY + '\'' +
                ", color=" + color +
                '}';
    }
}
