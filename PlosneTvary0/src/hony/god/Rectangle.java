package hony.god;
import java.awt.Color;

public class Rectangle extends FlatShape {

    private float sideA;
    private float sideB;

    public Rectangle(float sideA, float sideB, Color color, int coordinateX, int coordinateY) {
        super(color, coordinateX, coordinateY);
        this.sideA = sideA;
        this.sideB = sideB;
        System.out.println("rectangle");
    }

    @Override
    public String toString() {
        return super.toString()
                + " Rectangle{" + "sideA=" + sideA + ", sideB=" + sideB + '}';
    }

    public float circumference() {
        return 2 * (this.sideA + this.sideB);
    }

    public float area() {
        return this.sideA * this.sideB;
    }

}
