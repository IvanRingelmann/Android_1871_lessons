package lesson7;

public class Lesson7Main {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Барсик", 50, false),
                new Cat("Мурзик", 100, false),
                new Cat("Васька", 300, false),
        };

        Plate plate = new Plate();
        plate.putFood(250);

        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isFullness() == false && cats[i].getAppetite() < plate.getFoodAmount()) {
                cats[i].eat(plate);
            }
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println(" Сытость " + cats[i].getName() + " - " + cats[i].isFullness());
        }




    }


}
