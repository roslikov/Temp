public class Task7 {

    /*Имеется два дома размерами a на b и c на d. Имеется участок размерами e на f.
    Проверить помещаются ли эти дома на данном участке. Стороны домов - параллельны
    сторонам участка, в остальном размещение может быть любым.*/

    public static void main(String[] args) {
            /*Ввод параметров участка и домов*/
        int HPlot = 15;
        int WPlot = 15;
        int HFirstHouse = 5;
        int WFirstHouse = 12;
        int HSecondHouse = 8;
        int WSecondHouse = 4;
            /*Первая проверка входят ли дома по площади на участок*/
        if (HPlot * WPlot >= (HFirstHouse * WFirstHouse) + (HSecondHouse * WSecondHouse)){
            /*Проверяем поместятся ли дома до одной из сторон участка*/
            if (HPlot >= HFirstHouse + HSecondHouse && WPlot >= WSecondHouse + WFirstHouse){
                System.out.println("Дома поместятся на участок");
                } else if (HPlot >= HFirstHouse + WSecondHouse && WPlot >= WFirstHouse + HSecondHouse){
                System.out.println("Дома поместятся на участок");
                } else {
                System.out.println("Дома на учаток НЕ поместятся");
                }
            } else {
            System.out.println("Дома на учаток НЕ поместятся");
        }
    }
}
