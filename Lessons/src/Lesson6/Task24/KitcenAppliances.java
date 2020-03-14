package Lesson6.Task24;

public class KitcenAppliances extends Appliances {

    String model;
    boolean forCooking;
    boolean freezing;
    boolean warmingUp;

    public KitcenAppliances(String manufacturer, String countryManufacturer, int power, boolean pluggedInPower,
                            String model, boolean forCooking, boolean freezing, boolean warmingUp) {
        super(manufacturer, countryManufacturer, power, pluggedInPower);
        this.model = model;
        this.forCooking = forCooking;
        this.freezing = freezing;
        this.warmingUp = warmingUp;
    }

    @Override
    public String toString() {
        return "KitcenAppliances{" +
                "model='" + model + '\'' +
                ", forCooking=" + forCooking +
                ", freezing=" + freezing +
                ", warmingUp=" + warmingUp +
                ", manufacturer='" + manufacturer + '\'' +
                ", countryManufacturer='" + countryManufacturer + '\'' +
                ", power=" + power +
                ", pluggedInPower=" + pluggedInPower +
                '}';
    }
}
