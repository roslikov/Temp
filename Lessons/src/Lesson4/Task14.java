package Lesson4;

public class Task14 {

   /* В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.*/

    public static void main(String[] args) {

        int marks [] = new int [20];        //Создание массива из 20 элементов
        int maxMark = 0;                    //Создание переменной для максимальной оценки
        int indexMark = 0;                  //Создание переменной для индекса максимальной оценки

        for(int i = 0; i < marks.length; i++){              //Создаем цикл и заполняем его случайными значениями от 1 до 10
            marks[i] = (int) (Math.random() * 10 + 1);
            if (marks[i] > maxMark){                        //Поиск максимальной оценки
                maxMark = marks[i];                         //Записываем значение максимальной оценки
                indexMark = i;                              //Записываем номер максимальной оценки
            }
            System.out.print(marks[i] + " ");          //Выводим значение элемента массива
        }

        System.out.println();
        System.out.println("Номер максимальной оценки: " + (indexMark + 1));  //Выводим номер максимальной оценки если считать с 1!!!
    }
}
