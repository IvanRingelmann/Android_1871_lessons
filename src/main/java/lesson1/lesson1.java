package lesson1;

public class lesson1 {

    public static void main(String[] args) {
        System.out.println(calculate());
        System.out.println(defineNum(1, 12));
        positiveNum(-1);
        System.out.println(negativeNum(0));
        massage("Ivan");
        howYear(2021);
    }

// 1-ое задание
    public static float calculate() {
        float a = 1.0f;
        float b = 2.0f;
        float c = 3.0f;
        float d = 4.0f;
        float result = a * (b + (c / d));
        return result;
    }

// 2-е задание
    public static boolean defineNum(int a, int b) {
        if (a + b > 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

// 3-тье задание
    public static void positiveNum(int a) {
        if (a >= 0) {
            System.out.println(" Это положительное число!");
        } else {
            System.out.println(" Это число отрицательное!");
        }
    }

// 4-ое задание
    public static boolean negativeNum(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

// 5-ое задание
    public static void massage (String a) {
        System.out.println(" Привет," + a + "!");
    }

// 6-ое задание
    public static void howYear(int a) {
        if (a % 4 == 0 && a % 100 !=0 || a % 400 == 0) {
            System.out.println(" Этот год високосный!");
        } else {
            System.out.println(" Этот год НЕ високосный!");
        }
    }
}
