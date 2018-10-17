package hony.god;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        System.out.println("Počet obrazců je: " + FlatShape.numShapes);
        FlatShape[] shapes = new FlatShape[6];
        Color color = new Color(255, 0, 0);
        shapes[0] = new Rectangle(20.0f, 45.0f, color, 10, 10);
        shapes[1] = new Circle(18,Color.GREEN,15,15);
        shapes[2] = new Triangle(3,4,5,Color.BLUE,12,12);
        shapes[3] = new Circle(9.5f,Color.BLUE,25,15);
        shapes[4] = new Rectangle(23.9f, 42.1f, Color.BLACK, 14, 12);
        shapes[5] = new Triangle(1,3,23,Color.BLUE,12,12);
        printShapes(shapes);
        System.out.println("Počet obrazců je: " + FlatShape.numShapes);

    }
    public static void printShapes(FlatShape[] shapes){
        for (FlatShape shape : shapes){
            System.out.println(shape);
            System.out.println("area= "+ shape.area() + " circumference= "+ shape.circumference());
            if (shape instanceof Triangle){
                System.out.println("Triangle= "+ ((Triangle) shape).isExist());
            }
        }
    }
}
