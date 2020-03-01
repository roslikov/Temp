package Lesson5;

public class Task20 {

    /*Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.*/

    public static String string = "   Привет    мир, это. задание   Требует умение работы со строками";

    public static void main(String[] args) {

        System.out.println(lastLettrersOfWord());

    }

    public static String lastLettrersOfWord() {
        string = string.trim();
        String[] arrString = string.split(" ");
        StringBuilder newString = new StringBuilder();
        for (String word : arrString) {
            for (int i = word.length() - 1; i > 0; i--) {
                if (Character.isLetter(word.charAt(i))) {
                    newString.append(word.charAt(i));
                    break;
                }
            }
            
        }
        return newString.toString();

    }

}
