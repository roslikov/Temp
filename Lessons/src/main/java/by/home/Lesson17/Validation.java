package by.home.Lesson17;

/*Провалидировать адрес электронного кошелька, пример начало всегда
с букв 'E' 'D' 'R' после буквы следает 12 чисел, возможен ввод
с пробелами это не должно влять на нашу проверку*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private static final Pattern VALIDATION = Pattern.compile("[EDR]{1}[0-9]{12}");
    private static final String STRING = " R 123 456 789 0 12";

    public static void main(String[] args) {
        CheckValidation(STRING);
    }

    public static void CheckValidation (String string) {
        Matcher m = VALIDATION.matcher(string.replaceAll(" ", ""));
        if (m.matches()) {
            System.out.print("Good validation");
        } else {
            System.out.print("Bad validation");
        }
    }
}
