package Lesson9.Task25;

public class Electron extends VirtualCard {

    public Electron(final String name, final int balance) {
        super(name, balance);
    }

    @Override
    public String toString() {
        return super.toString() + " Type Card - Electron";
    }
}
