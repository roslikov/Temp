package by.home.Lesson15.Books;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Book implements Serializable {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public List<Book> ListBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Лев Толстой", "«Анна Каренина»"));
        books.add(new Book("Лев Толстой", "«Война и мир»"));
        books.add(new Book("Лев Толстой", "«Воскресение»"));
        books.add(new Book("Лев Толстой", "«Крейцерова соната»"));
        books.add(new Book("Джофри Чосер", "«Кентерберийские рассказы»"));
        books.add(new Book("Геродот", "«История»"));
        books.add(new Book("Джон Толкин", "«Властелин колец»"));
        books.add(new Book("Джон Толкин", "«Фермер Джайлс из Хэма»"));
        books.add(new Book("Джон Толкин", "«Хоббит, или Туда и обратно»"));
        books.add(new Book("Джон Толкин", "«Сильмариллион»"));
        return books;
    }

}
