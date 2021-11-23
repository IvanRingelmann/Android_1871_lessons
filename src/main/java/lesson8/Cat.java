package lesson8;

public class Cat implements Moving {

    private String type;
    private String name;
    private int maxRun;
    private int maxJump;


    public Cat(String type, String name, int maxRun, int maxJump) {

        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {

        return this.maxRun >= length;
    }

    @Override
    public boolean jump(int height) {

        return this.maxJump >= height;
    }

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getMaxJump() {
        return this.maxJump;
    }

    @Override
    public int getMaxRun() {
        return this.maxRun;
    }
}
