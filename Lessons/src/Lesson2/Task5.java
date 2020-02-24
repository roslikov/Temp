package Lesson2;

public class Task5 {

    /*Имеется целое число (любое), это число - сумма денег в рублях.
    Вывести это число, добавив к нему слово "рублей" в првильном падеже.*/

    public static void main(String[] args) {
        int Money = 111;            //Сумма денег

        if (Money < 0) {            //Если сумма меньше 0
            System.out.println("Должен Васе " + (Money * -1) + " денег... Печаль... Беда...");
        } else if (Money == 0) {    //Если сумма равна 0
            System.out.println("Денег нет совсем, но вы держитесь.");
        } else if (Money >= 11 && Money <= 19 || Money >= 111 && Money <= 119
                || Money >= 211 && Money <= 219) {          //???? Разобраться
            System.out.println(Money + " рублей");
        } else if ( Money % 10 == 0 || Money % 10 == 5
           || Money % 10 == 6 || Money % 10 == 7
           || Money % 10 == 8 || Money % 10 == 9){
            System.out.println(Money + " рублей.");
        } else if (Money % 10 == 1){
            System.out.println(Money + " рубль.");
        } else if (Money % 10 == 2 || Money % 10 == 3 || Money % 10 == 4) {
            System.out.println(Money + " рубля.");
        }

    }
}
