package by.home.Lesson5;

public class Task19 {

    /*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
    учесть, что слова могут разделяться несколькими пробелами, в начале и конце
    текста так же могут быть пробелы, но могут и отсувствовать.*/

    /**
     * The constant string.
     */
    public static String string = "   Привет    мир, это. задание   Требует умение работы со строками";

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        System.out.println("Число слов в строке " + searchWord());
    }

    /**
     * Search word int.
     *
     * @return the int
     */
    public static int searchWord() {
        string = string.trim();     //Удаляем пробелы перед и после строки
        string = string.replaceAll("\\s+", " ");    //Убираем лишние пробелы
        int count = 0;

        if(string.length() != 0){   //Если строка не пустая, сразу прибавляем счетчику 1 слово
            count++;
            for(int i = 0; i < string.length(); i++){

                if(string.charAt(i) == ' '){           //Если находит пробел, +1 слово
                    count++;
                }
            }
        }
        return count;

    }

}
