package lesson7;

public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    private int appetite;

    public int getAppetite() {
        return appetite;
    }

    private boolean fullness;

    public boolean isFullness() {
        return fullness;
    }

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        System.out.printf("%s поел\n", name);
        fullness = true;
    }

}

