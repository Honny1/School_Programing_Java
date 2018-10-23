package hony.god;

import java.awt.*;

public class Triangle extends FlatShape {

    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float sideA,float sideB,float sideC, Color color, int coordinateX, int coordinateY) {
        super(color, coordinateX, coordinateY);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        System.out.println("Triangle");
    }

    @Override
    public String toString() {
        return super.toString() + " Triangle{" + " A= " + sideA + ", B= " + sideB + ", C= " + sideC + '}';
    }

    @Override
    public float area() {
        float s = (this.sideA+this.sideB+this.sideC)/2;
        return (float)Math.sqrt(s*(s-this.sideA)*(s-this.sideB)*(s-this.sideC));
    }

    @Override
    public float circumference() {
        return this.sideA+this.sideB+this.sideC;
    }


    public boolean isExist() {
        return this.sideA+this.sideB > this.sideC && this.sideA+this.sideC > this.sideB && this.sideA+this.sideC > this.sideB;
    }
}
