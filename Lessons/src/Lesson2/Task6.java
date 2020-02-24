package Lesson2;

public class Task6 {

    /*Имеются три числа - день, месяц, год.
    Ввести в виде трех чисел дату следующего дня.*/

    public static void main(String[] args) {
        int day = 29;
        int month = 2;
        int year = 1900;
        /*Проверка на корректность даты*/
        if (day < 1 || day > 31) {
            System.out.println("Введите день от 1 до 31");
        } else if (month < 0 || month > 12) {
            System.out.println("Введите месяц от 1 до 12");
        } else if (day >= 29 && month == 2 && year % 4 != 0){
            System.out.println("В этом году в феврале 28 дней");
        } else if (day >= 30 && month == 2 && year % 4 == 0){
            System.out.println("В этом году в феврале 29 дней");
        } else if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)){
            System.out.println("Такой даты не существует! Измените день!");
        } else {
            day = day + 1;
            if (day >= 30 && month == 2 && year % 4 == 0){
                day = 1;
                month = month + 1;
            } else if (day >= 29 && month == 2 && year % 4 != 0){
                day = 1;
                month = month + 1;
            } else if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)){
                day = 1;
                month = month + 1;
            } else if (day > 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)){
                day = 1;
                month = month + 1;
            } else  if (day > 31 && month == 12){
                day = 1;
                month = 1;
                year = year + 1;
            }
            System.out.println("Следующая дата: " + day + "." + month + "." + year);
        }
    }
}
