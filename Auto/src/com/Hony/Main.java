package com.Hony;

public class Main {

    public static void main(String[] args) {
        Car car0 = new Car("Audi","96B8886",50,5.7f);
        Car car1 = new Car("BNW","6969FGV",69,7.5f);
        Car car2 = new Car("Mercedes","ADFJI12",100,19.6f);
        car0.refuel(600f);
        car1.refuel(60.5f);
        car2.refuel();
        car0.go(100);
        System.out.println(car0);
        System.out.println(car1);
        System.out.println(car2);

    }
}
