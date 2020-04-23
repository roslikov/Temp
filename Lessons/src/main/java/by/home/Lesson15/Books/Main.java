package by.home.Lesson15.Books;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {
        File file = new File();
        Book book = new Book();
        if (!file.checkAvailabilityFile()){
            file.CreateFile();
            file.writeToFile(book.ListBooks());
        }
        Map <String, String> map = file.ReadFile().stream()
                .collect(Collectors.groupingBy(Book::getAuthor,
                        Collectors.mapping(Book::getTitle,
                                Collectors.joining("; "))));
        map.forEach((key, value) -> System.out.println(key + " : " + value));
        file.fileDelete();
    }

}