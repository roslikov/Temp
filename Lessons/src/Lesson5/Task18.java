package Lesson5;

public class Task18 {

    /*Найти в строке не только запятые, но и другие знаки препинания.
    Подсчитать общее их количество.*/

    /**
     * The constant string.
     */
    public static String string = "kwejri2892 (*&#%% kaj92 !# 9";

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        System.out.println(searchSymbols());

    }

    private static int searchSymbols() {

        int countSymbol = 0;
        int dec;

        for(int i = 0; i < string.length(); i++){
            dec = (int) string.charAt(i);
            if(dec > 32 && dec < 48 ||
                    dec > 57 && dec < 65 ||
                    dec > 90 && dec < 97 ||
                    dec > 122 && dec < 192) {
                countSymbol++;
            }
        }
        return countSymbol;
    }

}
