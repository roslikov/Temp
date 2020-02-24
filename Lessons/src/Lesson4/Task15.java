package Lesson4;

public class Task15 {

    /*Опеределите сумму элементов массива, расположенных между максимальным и минимальным значениями.*/

    /**
     * The Array.
     */
    static int array [] = new int [15];
    static int maxArray = 0;
    static int minArray = 0;
    static int maxIndex = 0;
    static int minIndex = 0;
    static int sum = 0;


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        createAndFillingArr(array);
        System.out.println("Максимальное значения массива: " + findMaxArr(maxArray));
        System.out.println("Минимальное значения массива: " + findMinArr(minArray));
        System.out.println("Сумма между этими числами: " + outSum(sum));

    }


    /**
     * Create and filling array.
     *
     * @param array the array
     */
    public static void createAndFillingArr(int array[]){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Find max array.
     *
     * @param maxArray the max array
     * @return
     */
    public static int findMaxArr(int maxArray){
        for(int i = 0; i < array.length; i++){
            if (array[i] > maxArray) {
                maxArray = array[i];
                maxIndex = i;
            }
        }
        return maxArray;
    }

    /**
     * Find min array.
     *
     * @param minArray the min array
     * @return
     */
    public static int findMinArr(int minArray){
        minArray = findMaxArr(maxArray);
        for(int i = 0; i < array.length; i++){
            if (array[i] < minArray) {
                minArray = array[i];
                minIndex = i;
            }
        }
        return minArray;
    }

    /**
     * Out sum.
     *
     * @param sum the sum
     * @return
     */
    public static int outSum(int sum){
        if (maxIndex > minIndex){
            for (int i = minIndex + 1; i < maxIndex; i++){
                sum += array[i];
            }
        } else {
            for (int i = maxIndex + 1; i < minIndex; i++){
                sum += array[i];
            }
        }
        return sum;
    }

}
