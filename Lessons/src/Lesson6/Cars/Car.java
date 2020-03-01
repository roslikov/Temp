package Lesson6.Cars;

import java.time.LocalDate;

public class Car {

    String name;
    private int volumeTank;
    private double consumption;
    private int manufactureYear;

    public Car(String name, int volumeTank, double consumption, int manufactureYear) {
        this.name = name;
        this.volumeTank = volumeTank;
        this.consumption = consumption;
        this.manufactureYear = manufactureYear;
    }

    public int maxDistance (){
        double distance = volumeTank / consumption * 100;
        return (int)distance;
    }

    public int carYear (){
        int carYear;
        carYear = LocalDate.now().getYear()- manufactureYear;
        return carYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", volumeTank=" + volumeTank +
                ", consumption=" + consumption +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
}
