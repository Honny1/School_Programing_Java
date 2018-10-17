package hony.god;
import java.awt.Color;

public class Circle extends FlatShape {

    private float radius;


    public Circle(float radius, Color color, int coordinateX, int coordinateY) {
        super(color, coordinateX, coordinateY);
        this.radius = radius;
        System.out.println("circle");
    }

    @Override
    public String toString() {
        return super.toString() + " Circle{" + "radius=" + radius + '}';
    }

    @Override
    public float area() {
        return (float)Math.PI * this.radius * this.radius;
    }

    @Override
    public float circumference() {
        return 2 * (float)Math.PI * this.radius;
    }
}
