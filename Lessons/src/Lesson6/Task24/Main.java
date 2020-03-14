package Lesson6.Task24;

/*Создать иерархию класов, описывающих бытовую технику. Создать несколько объектов
описанных классов, чать из них включить в розетку.
Иерархия должны быть хотя бы три уровня.*/

public class Main {
    public static void main(String[] args) {
        Appliances appliances = new Appliances("Indesit", "China",1500,false);
        KitcenAppliances refrigerator = new KitcenAppliances("Bosch","Poland",
                1000,true,"KX543-Z",false,true,false);
        Oven oven = new Oven("Gefest","Belarus",1700, false,
                "3200",true, false, true,"Natural Gas",250);

        System.out.println(appliances.toString());
        System.out.println(refrigerator.toString());
        System.out.println(oven.toString());
    }
}
