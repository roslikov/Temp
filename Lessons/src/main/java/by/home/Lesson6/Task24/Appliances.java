package by.home.Lesson6.Task24;

public class Appliances {
    String manufacturer;
    String countryManufacturer;
    int power;
    boolean pluggedInPower;

    @Override
    public String toString() {
        return "Appliances{" +
                "manufacturer='" + manufacturer + '\'' +
                ", countryManufacturer='" + countryManufacturer + '\'' +
                ", power=" + power +
                ", pluggedInPower=" + pluggedInPower +
                '}';
    }

    public Appliances(String manufacturer, String countryManufacturer, int power, boolean pluggedInPower){
        this.manufacturer = manufacturer;
        this.countryManufacturer = countryManufacturer;
        this.power = power;
        this.pluggedInPower = pluggedInPower;
    }
}
