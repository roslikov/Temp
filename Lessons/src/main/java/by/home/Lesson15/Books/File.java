package by.home.Lesson15.Books;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class File {
    private final java.io.File directory = new java.io.File(".\\Books");
    private final java.io.File file = new java.io.File(".\\Books\\books.txt");

    public boolean checkAvailabilityFile (){
        return this.file.exists();
    }

    public void CreateFile() {
        directory.mkdir();
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeToFile(List<Book> books) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.file))) {
            for (Book book : books) {
                objectOutputStream.writeObject(book);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Book> ReadFile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(this.file))) {
            List<Book> books = new ArrayList<>();
            while (true) {
                try {
                    books.add((Book) inputStream.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
            return books;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }

    public void fileDelete() {
        this.file.delete();
        this.directory.delete();
    }
}