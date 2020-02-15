public class Task4 {

        /*Имеется прямоугольное отверстие размерами a и b,
        определить можно ли его полностью закрыть
        круглой картонкой радиусом r.*/

    public static void main(String[] args) {
    int heightRectangle = 4;        //Высота прямоугольного отверстия
    int widthRectangle = 3;         //Ширина прямоугольного отверстия
    int radiusCircle = 10;          //Радиус круга
    int diameter = radiusCircle * 2;

    if (Math.sqrt((heightRectangle * heightRectangle)+(widthRectangle * widthRectangle))  < diameter){
        System.out.println("Круг перекрывает прямоугольное отверстие");
    }
    else {
        System.out.println("Круг меньше отверстия!");
    }
    }
}
