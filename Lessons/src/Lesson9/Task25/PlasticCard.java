package Lesson9.Task25;

public class PlasticCard extends Card{
    private boolean virtual = false;
    public PlasticCard(final String name, final int balance) {
        super(name, balance);
    }

    @Override
    public String toString() {
        return super.toString() + " PlasticCard{" +
                "virtual=" + virtual +
                "}";
    }
}
