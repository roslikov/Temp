public class Task17 {

    /*Создать двухмерный квадратный массив, и заполнить его "бабочкой"*/

    /**
     * The Array.
     */
    static int array[][] = new int[8][8];

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
    outButterflyArray();
    }

    /**
     * Create butterfly filling.
     */
    public static void butterflyFilling() {
        for(int i = 0; i < array.length / 2 + 1; i++){
            for(int j = 0; j < array[i].length; j++){
                if((j<i) || (j>=(array[i].length-i))){
                    array[i][j] = 0;
                } else{
                    array[i][j] = 1;
                }
            }
        }
        for(int i = array.length - 1; i >= array.length / 2; i--){
            for(int j = 0; j < array[i].length; j++){
                if((j < (array[i].length - 1 - i)) || (j > i)){
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
    }

    /**
     * Out butterfly array.
     */
    public static void outButterflyArray(){
        butterflyFilling();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }
}
