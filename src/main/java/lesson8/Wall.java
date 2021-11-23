package lesson8;

public class Wall implements Trap {

    private final int height;

    public Wall(int height) {

        this.height = height;
    }

    @Override
    public boolean cross(Moving moving) {

        if (moving.jump(this.height)) {
            System.out.println(moving.getName() + " прыгнул на " + height + " метров \n");
            return true;

        } else System.out.println(moving.getName() + " НЕ прыгнул на " + height + " метров, потому что может прыгнуть на " + moving.getMaxJump() + " метров\n");
        return true;
    }
}
