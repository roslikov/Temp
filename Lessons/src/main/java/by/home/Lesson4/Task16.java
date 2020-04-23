package by.home.Lesson4;

public class Task16 {

    /*Создать массив, заполнить его случайными значениями, распечатать, перевернуть,
    и снова распечатать (при переворачивании нежелательно создавать еще один массив).*/

    /**
     * The Array.
     */
    static int array [] = new int [16];
    /**
     * The Temp.
     */
    static int temp = 0;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        createAndFillingArray(array);
        outFlipArray(temp);

    }

    /**
     * Creating and populating random array values.
     *
     * @param array the array
     */
    public static void createAndFillingArray(int array[]){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Flipping an array using a variable temp
     * Out flip array.
     *
     * @param temp the temp
     */
    public static void outFlipArray(int temp){
        for(int i = 0; i < array.length / 2; i++){
            temp = array[array.length - i -1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
