package Lesson9.Task25;

public class Mastercard extends PlasticCard {
    private float cashBack = 0.02f;

    public Mastercard(final String name, final int balance, final float cashBack) {
        super(name, balance);
        this.cashBack = cashBack;
    }

    @Override
    public String toString() {
        return super.toString() + " Mastercard{" +
                "cashBack=" + cashBack +
                "}";
    }
}
