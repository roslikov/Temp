public class Lesson4 {

        /*Имеется прямоугольное отверстие размерами a и b,
        определить можно ли его полностью закрыть
        круглой картонкой радиусом r.*/

    public static void main(String[] args) {
    int HeightRectangle = 128;      //Высота прямоугольного отверстия
    int WidthRectangle = 1;         //Ширина прямоугольного отверстия
    int RadiusCircle = 50;          //Радиус круга

    if ((HeightRectangle * WidthRectangle) < (2 * Math.PI * RadiusCircle)
        && (RadiusCircle * 2) > HeightRectangle
        && (RadiusCircle * 2) > WidthRectangle){
        System.out.println("Круг перекрывает прямоугольное отверстие");
    }
    else {
        System.out.println("Круг меньше отверстия!");
    }
    }
}
