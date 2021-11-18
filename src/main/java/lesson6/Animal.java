package lesson6;

public abstract class Animal {

    public static int count;

    String name;
    int maxRunDist;
    int maxSwimDist;

    public Animal(String name, int maxRunDist, int maxSwimDist) {
        count++;

        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
    }

    public void run(int distance) {
        if (maxRunDist == 0) {
            System.out.println(name + " не умеет бегать!");
            return;
        }
        if (distance <= maxRunDist) {
            System.out.println( name + " успешно справился с забегом");
        } else {
            System.out.println( name + " не справился с забегом," + " но пробежал " + maxRunDist);
        }
    }

    public void swim(int distance) {
        if (maxSwimDist == 0) {
            System.out.println( name + " не умеет плавать!");
            return;
        }

        if (distance <= maxSwimDist) {
            System.out.println( name + " успешно справился с заплывом");
        } else {
            System.out.println( name + " не справился с заплывом," + " но проплыл " + maxSwimDist);
        }
    }
}
