package Lesson7.ATM;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface StorageOperation {

    Card create(Card card) throws IOException, ClassNotFoundException;
    Card read(Card card) throws IOException;
}
