package Lesson6.Task23;

import java.io.*;

/**
 * The type Storage.
 */
public class Storage implements StorageOperation {

    /**
     * The File.
     */
    File file = new File("balance.db");


    /**
     * Creating file database or reading database file.
     * @param card
     * @throws IOException
     * @throws ClassNotFoundException
     * @return
     */
    @Override
    public Card createBalance(Card card) throws IOException, ClassNotFoundException {
        Card cardNew = null;
            if (!file.exists()) {
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream("balance.db");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(card);
                objectOutputStream.close();
            } else {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                cardNew = (Card) objectInputStream.readObject();
                card.setBalance(cardNew.getBalance());
                card.setPin(cardNew.getPin());
                objectInputStream.close();
            }
        return cardNew;
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
