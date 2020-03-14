package Lesson9.Task25;

public class VirtualCard extends Card{
    private boolean virtual = true;
    public VirtualCard(final String name, final int balance) {
        super(name, balance);
    }

    @Override
    public String toString() {
        return super.toString() + " VirtualCard{" +
                "virtual=" + virtual +
                "}";
    }
}
