package Lesson13.Task30;

import java.io.*;
import java.util.Arrays;

/*
Создать файл с текстом, прочитать, подсчитать количество знаков
препинания и слов..
*/

public class Main {


    public static int wordsCount = 0;
    public static int punctuationCount = 0;

    public static void main(String[] args) {

        File file = new File("C:\\Lessons_HTP\\Lessons_HTP\\Task30.db");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String res = bufferedReader.readLine();

            while (res != null) {
                System.out.println(res);
                getWordsCount(res);
                getPunctuationCount(res);
                res = bufferedReader.readLine();
            }

            System.out.println("Всего слов в файле - " + wordsCount);
            System.out.println("Всего знаков препинания - " + punctuationCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error to read file!");
        }
    }

    /**
     * Gets words count.
     *
     * @param string the string
     */
    public static void getWordsCount(String string) {
        Arrays.asList(string
                .replaceAll("[^A-Za-zА-Яа-я]", " ")
                .split("\\s+"))
                .forEach(w -> ++wordsCount);
    }

    /**
     * Gets punctuation count.
     *
     * @param string the string
     */
    public static void getPunctuationCount(String string) {
        int dec;
        for (int i = 0; i < string.length(); i++) {
            dec = (int) string.charAt(i);
            if (dec > 32 && dec < 48 ||
                    dec > 57 && dec < 65 ||
                    dec > 90 && dec < 97 ||
                    dec > 122 && dec < 192) {
                ++punctuationCount;
            }
        }
    }
}

