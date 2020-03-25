package Lesson6.Task23;

import java.io.IOException;

/**
 * This is interface for storage Operation
 */
public interface StorageOperation {

    /**
     * Create balance card.
     * @param card the card
     * @return the card
     * @throws IOException            the io exception
     * @throws ClassNotFoundException the class not found exception
     */
    Card createBalance(Card card) throws IOException, ClassNotFoundException;

    /**
     * Read card.
     * @param card the card
     * @return the card
     * @throws IOException            the io exception
     * @throws ClassNotFoundException the class not found exception
     */
    Card read(Card card) throws IOException, ClassNotFoundException;

    /**
     * Write card.
     * @param card the card
     * @return the card
     * @throws IOException the io exception
     */
    Card write(Card card) throws IOException;
}
