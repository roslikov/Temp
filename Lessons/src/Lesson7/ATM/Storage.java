package Lesson7.ATM;

import java.io.*;

public class Storage implements StorageOperation {

    File file = new File("balance.db");

    /**
     * Creating file database or reading database file.
     * @param card
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override
    public Card createBalance(Card card) throws IOException, ClassNotFoundException {
        try {
            if (!file.exists()) {
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream("balance.db");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(card);
                objectOutputStream.close();
                return card;
            } else {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                card = (Card) objectInputStream.readObject();
                objectInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return card;
    }


    /**
     * Read file and return class Card
     * @param card
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override
    public Card read(Card card) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        card = (Card) objectInputStream.readObject();
        objectInputStream.close();

        return card;
    }

    /**
     * Write class Card for file
     * @param card
     * @return
     * @throws IOException
     */
    @Override
    public Card write(Card card) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("balance.db");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(card);
        objectOutputStream.close();
        return card;
    }
}
