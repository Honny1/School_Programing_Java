package com.Hony;

public class Car {
    private final String brand;
    private String licensePlate;
    private final float fullMax;
    private float fuelLevel;
    private float avarageUse;
    private float mileage;

    Car(String brand, String licensePlate, float fullMax, float avarageUse) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.fullMax = fullMax;
        this.avarageUse = avarageUse;
        this.fuelLevel = 0.0f;
        this.mileage = 0.0f;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", fullMax=" + fullMax +
                ", fuelLevel=" + fuelLevel +
                ", avarageUse=" + avarageUse +
                ", mileage=" + mileage +
                '}';
    }

    float refuel(float liters){
        if(this.fuelLevel+liters<this.fullMax){
            this.fuelLevel += liters;
            return liters;
        }else{
            this.fuelLevel = this.fullMax;
            return this.fullMax-this.fuelLevel;
        }
    }
    float refuel(){
        this.fuelLevel = this.fullMax;
        return this.fullMax-this.fuelLevel;
    }
    void go(float km){
        
    }
}
