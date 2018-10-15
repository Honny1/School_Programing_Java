package com.Hony;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Audi","96B8886",50,5.7f);
        cars[1] = new Car("BNW","6969FGV",69,7.5f);
        cars[2] = new Car("Mercedes","ADFJI12",100,19.6f);
        cars[0].refuel(600f);
        cars[1].refuel(60.5f);
        cars[2].refuel();
        printCar(cars);
        cars[0].go(100);
        cars[1].go(13567);
        printCar(cars);
    }
    public static void printCar(Car[] cars){
        System.out.println("Car List:");
        for(Car car:cars){
            System.out.println(car);
        }
    }
}
