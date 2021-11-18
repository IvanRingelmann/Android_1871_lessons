package lesson6;

public class Dog extends Animal {

    public static int count;

    public Dog(String name, int maxRunDist, int maxSwimDist) {
        super(name, maxRunDist, maxSwimDist);
        count++;
    }
}
