package by.home.Lesson6.Cars;

public class Main {
    public static void main(String[] args) {

        Car bus = new Car("Toyota Picnik", 95, 7.8, 1992);
        Car golf = new Car("VW Golf", 60, 4.6, 1990);

        if (bus.maxDistance() == golf.maxDistance()){
            System.out.println("Автмобили проедут одинаковую дистанцию");
        } else if (bus.maxDistance() > golf.maxDistance()) {
            System.out.println(bus.name + " проедет дальше " + golf.name);
        } else {
            System.out.println(golf.name + " проедет дальше " + bus.name);
        }

        System.out.println("Автомобилю " + golf.name + " с момента выпуска " + bus.carYear() + " лет");

    }
}
