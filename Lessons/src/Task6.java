public class Task6 {

    /*Имеются три числа - день, месяц, год.
    Ввести в виде трех чисел дату следующего дня.*/

    public static void main(String[] args) {
        int Day = 31;               //Будем считать что в каждом месяце 31 день, а по хорошему
        int Month = 12;             //нужно выщитывать каждый месяц и смотреть на год.
        int Year = 2020;            //Но наверняка для всего этого уже есть разработанная функция.
        /*Проверка на корректность даты*/
        if (Day < 1 || Day > 31) {
            System.out.println("Введите день от 1 до 31");
        } else if (Month < 0 || Month > 12) {
            System.out.println("Введите месяц от 1 до 12");
        } else {
            Day = Day + 1;      //Увеличение даты на один день
            if (Day > 31) {
                Month = Month + 1;
                Day = 1;
                if (Month > 12) {
                    Year = Year + 1;
                    Month = 1;
                }
                System.out.println("Следующая дата: " + Day + "." + Month + "." + Year);

            }
        }
    }
}
