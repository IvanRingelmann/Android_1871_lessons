package lesson7;

public class Plate {

    private int foodAmount;

    public void decreaseFood(int amount) {
        foodAmount -= amount;
        System.out.printf("Количество еды уменьшилось на %d, %d еды осталось\n", amount, foodAmount);

    }

    public void putFood(int amount) {
        foodAmount += amount;
        System.out.printf("Количество еды увеличилось на %d, %d еды осталось\n", amount, foodAmount);
        System.out.println("\n");

    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
