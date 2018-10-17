package hony.god;
import java.awt.Color;

public abstract class FlatShape {

    protected Color color;
    protected int coordinateX;
    protected int coordinateY;
    static int numShapes=0;

    public FlatShape(Color color, int coordinateX, int coordinateY) {
        this.color = color;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        numShapes++;
        System.out.print("New shape: ");
    }

    @Override
    public String toString() {
        return "FlatShape{" + "color=" + color
                + ", coordinateX=" + coordinateX + ", coordinateY=" + coordinateY + '}';
    }

    public abstract float circumference();
    public abstract float area();
}
