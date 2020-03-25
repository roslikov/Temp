package Lesson6.Task23;


import java.io.IOException;

/**
 * Start the program ATM
 */
public class Main {

    /**
     * Is atm session boolean.
     * @return the boolean
     */
    public static boolean isAtmSession() {
        return atmSession;
    }

    /**
     * Sets atm session.
     * @param atmSession the atm session
     */
    public static void setAtmSession(final boolean atmSession) {
        Main.atmSession = atmSession;
    }

    private static boolean atmSession = false;

    /**
     * The entry point of application.
     * @param args the input arguments
     * @throws IOException            the io exception
     * @throws ClassNotFoundException the class not found exception
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Card card = new Card(5000, 5864);
        Security.checkPin(card);
        Run.startApplication(card);
    }

}
