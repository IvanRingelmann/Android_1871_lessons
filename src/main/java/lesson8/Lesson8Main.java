package lesson8;

public class Lesson8Main {

    public static void main(String[] args) {

        Moving[] movings = {
                new Cat("Кот","Борис",800, 2),
                new Human("Человек","Ваня", 1000, 1),
                new Robot("Робот","Яша",10, 0),
        };

        Trap[] barriers = {
                new Treadmill(900),
                new Wall(1),
        };

        for (Moving m : movings) {
            for (Trap t : barriers) {
                if (!t.cross(m))
                    break;
            }

        }

    }


}
