public class Task4 {

        /*Имеется прямоугольное отверстие размерами a и b,
        определить можно ли его полностью закрыть
        круглой картонкой радиусом r.*/

    public static void main(String[] args) {
    int HeightRectangle = 6;        //Высота прямоугольного отверстия
    int WidthRectangle = 3;         //Ширина прямоугольного отверстия
    int RadiusCircle = 50;          //Радиус круга
        
    if ((Math.abs((HeightRectangle * HeightRectangle)+(WidthRectangle * WidthRectangle)) / 2  < RadiusCircle)){
        System.out.println("Круг перекрывает прямоугольное отверстие");
    }
    else {
        System.out.println("Круг меньше отверстия!");
    }
    }
}
