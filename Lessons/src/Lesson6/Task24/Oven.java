package Lesson6.Task24;

public class Oven extends KitcenAppliances{
    String kindOfEnergy;
    int maxTemperature;

    @Override
    public String toString() {
        return "Oven{" +
                "kindOfEnergy='" + kindOfEnergy + '\'' +
                ", maxTemperature=" + maxTemperature +
                ", model='" + model + '\'' +
                ", forCooking=" + forCooking +
                ", freezing=" + freezing +
                ", warmingUp=" + warmingUp +
                ", manufacturer='" + manufacturer + '\'' +
                ", countryManufacturer='" + countryManufacturer + '\'' +
                ", power=" + power +
                ", pluggedInPower=" + pluggedInPower +
                '}';
    }

    public Oven(String manufacturer, String countryManufacturer, int power, boolean pluggedInPower, String model,
                boolean forCooking, boolean freezing, boolean warmingUp, String kindOfEnergy, int maxTemperature) {
        super(manufacturer, countryManufacturer, power, pluggedInPower, model, forCooking, freezing, warmingUp);
        this.kindOfEnergy = kindOfEnergy;
        this.maxTemperature = maxTemperature;
    }
}
