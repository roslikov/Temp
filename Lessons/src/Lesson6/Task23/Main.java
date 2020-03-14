package Lesson6.Task23;


import java.io.IOException;

/**
 * Start the program ATM
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Card card = new Card(5000, 5864);
        Security.checkPin(card);
    }
}
