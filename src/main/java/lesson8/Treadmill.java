package lesson8;

public class Treadmill implements Trap {

    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean cross(Moving moving) {

        if (moving.run(this.length)) {
            System.out.println(moving.getName() + " пробежал " + length + " метров \n");
            return true;

        } else System.out.println(moving.getName() + " НЕ пробежал " + length + " метров, потому что может пробежать " + moving.getMaxRun() + " метров\n");
        return true;
    }
}
