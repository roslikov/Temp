package by.home.Lesson10;

/*Имеется текст. Следует составить для него частоточный словарь.*/

import java.util.*;

public class Task29 {
    public static void main(String[] args) {
        final String string = "Имеется текст, текст. Следует текст " +
                "составить частоточный< имеется >словарь Текст частоточный " +
                " qwerty Hello qwerty Текст";

        Map<String, Integer> vocabulary = new HashMap<>();
        Arrays.asList(string.toLowerCase()
                .replaceAll("[^A-Za-zА-Яа-я]", " ")
                .split("\\s+"))
                .forEach(w -> vocabulary
                        .put(w, vocabulary
                                .containsKey(w)
                                ? vocabulary.get(w) + 1
                                : 1));
        System.out.println(vocabulary);
    }
}
