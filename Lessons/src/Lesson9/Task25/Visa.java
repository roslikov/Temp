package Lesson9.Task25;

public class Visa extends PlasticCard {
    private float cashBack = 0.05f;
    public Visa(final String name, final int balance) {
        super(name, balance);
    }

    @Override
    public String toString() {
        return super.toString() + " Visa{" +
                "cashBack=" + cashBack +
                "}";
    }
}
