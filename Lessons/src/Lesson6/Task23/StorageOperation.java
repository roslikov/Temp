package Lesson6.Task23;

import java.io.IOException;

/**
 * This is interface for storage Operation
 */
public interface StorageOperation {

    Card createBalance(Card card) throws IOException, ClassNotFoundException;
    Card read(Card card) throws IOException, ClassNotFoundException;
    Card write(Card card) throws IOException;
}
