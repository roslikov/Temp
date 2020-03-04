package Lesson7.ATM;

import java.io.IOException;

public interface StorageOperation {

    Card createBalance(Card card) throws IOException, ClassNotFoundException;
    Card read(Card card) throws IOException;
}
