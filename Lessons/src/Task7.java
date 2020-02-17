public class Task7 {

    /*Имеется два дома размерами a на b и c на d. Имеется участок размерами e на f.
    Проверить помещаются ли эти дома на данном участке. Стороны домов - параллельны
    сторонам участка, в остальном размещение может быть любым.*/

    public static void main(String[] args) {
            /*Ввод параметров участка и домов*/
        int hPlot = 5;
        int wPlot = 15;
        int hFirstHouse = 5;
        int wFirstHouse = 3;
        int hSecondHouse = 3;
        int wSecondHouse = 11;
            int hThoHouse = hFirstHouse + hSecondHouse;
            int wThoHouse = wFirstHouse + wSecondHouse;
            int hwThoHouse = hFirstHouse + wSecondHouse;
            int whThoHouse = wFirstHouse + hSecondHouse;

            /*Проверяем поместятся ли дома до одной из сторон участка*/
            if (hPlot >= hThoHouse && wPlot >= wThoHouse){
                System.out.println("Все ГУД!");
            } else if (hPlot >= wThoHouse && wPlot >= hThoHouse){
                System.out.println("Все ГУД!");
            } else if (hPlot >= hwThoHouse && wPlot >= whThoHouse){
                System.out.println("Все ГУД!");
            } else if (hPlot >= whThoHouse && wPlot >= hwThoHouse){
                System.out.println("Все ГУД!");
            } else {
                System.out.println("Дома на учаток НЕ поместятся!");
            }
    }
}
