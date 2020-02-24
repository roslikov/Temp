package Lesson2;

public class Task7 {

    /*Имеется два дома размерами a на b и c на d. Имеется участок размерами e на f.
    Проверить помещаются ли эти дома на данном участке. Стороны домов - параллельны
    сторонам участка, в остальном размещение может быть любым.*/

    public static void main(String[] args) {
            /*Ввод параметров участка и домов*/
        int hPlot = 5;
        int wPlot = 11;
        int hFirstHouse = 6;
        int wFirstHouse = 3;
        int hSecondHouse = 3;
        int wSecondHouse = 11;
            int hThoHouse = hFirstHouse + hSecondHouse;
            int wThoHouse = wFirstHouse + wSecondHouse;
            int hwThoHouse = hFirstHouse + wSecondHouse;
            int whThoHouse = wFirstHouse + hSecondHouse;
        int hMax = Math.max(hFirstHouse, hSecondHouse);
        int wMax = Math.max(wFirstHouse, wSecondHouse);
        int hwMax = Math.max(hFirstHouse, wSecondHouse);
        int whMax = Math.max(wFirstHouse, hSecondHouse);

            /*Проверяем поместятся ли дома до одной из сторон участка*/
            if (hPlot >= hThoHouse && wPlot >= wMax){
                System.out.println("Все ГУД!");
            } else if (hPlot >= wThoHouse && wPlot >= hMax){
                System.out.println("Все ГУД!");
            } else if (hPlot >= hwThoHouse && wPlot >= whMax){
                System.out.println("Все ГУД!");
            } else if (hPlot >= whThoHouse && wPlot >= hwMax){
                System.out.println("Все ГУД!");
            } else if (wPlot >= hThoHouse && hPlot >= wMax) {
                System.out.println("Все ГУД!");
            } else if (wPlot >= wThoHouse && hPlot >= hMax){
                System.out.println("Все ГУД!");
            } else if (wPlot >= hwThoHouse && hPlot >= whMax){
                System.out.println("Все ГУД!");
            } else if (wPlot >= whThoHouse && hPlot >= hwMax){
                System.out.println("Все ГУД!");
            } else  {
                System.out.println("Дома на учаток НЕ поместятся!");
            }
    }
}
