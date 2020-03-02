package Lesson5;

public class Task20 {

    /*Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.*/

    public static String string = "   Привет и но    мир, это. задание   Требует умение работы со строками";

    public static void main(String[] args) {

        System.out.println(lastLettersWords());
    }

    public static StringBuilder lastLettersWords(){

        StringBuilder newString = new StringBuilder();
        String[] arrayOfWords = string.split(" ");

        for (String arrayOfWord : arrayOfWords) {

            if (arrayOfWord.length() > 0)

                if (Character.isLetter(arrayOfWord.charAt(arrayOfWord.length() - 1))) {
                    newString.append(arrayOfWord.charAt(arrayOfWord.length() - 1));
                } else {
                    newString.append(arrayOfWord.charAt(arrayOfWord.length() - 2));
                }
        }
        return newString;
    }
}
