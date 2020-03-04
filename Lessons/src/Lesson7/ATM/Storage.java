package Lesson7.ATM;

import java.io.*;

public class Storage implements StorageOperation {

    @Override
    public Card createBalance(Card card) throws IOException, ClassNotFoundException {
        File file = new File("balance.db");
        boolean create = file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        if (fileInputStream.available() > 0) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            card.balance = (int) objectInputStream.readObject();
            objectInputStream.close();
        }
        return card;
    }


    @Override
    public Card read(Card card) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("balance.db");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(card);
        objectOutputStream.close();
        return card;
    }
}
