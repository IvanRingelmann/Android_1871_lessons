package lesson6;

public class Cat extends Animal {

    public static int count;

    public Cat(String name, int maxRunDist, int maxSwimDist) {
        super(name, maxRunDist, maxSwimDist);
        count++;
    }
}
