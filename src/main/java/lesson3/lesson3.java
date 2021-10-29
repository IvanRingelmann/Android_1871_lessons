package lesson3;

import java.util.Random;
import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {

        guessNum();
        guessWord();

    }

    public static void guessNum() {

        while (true) {

            Random random = new Random();
            int x = random.nextInt(10);

            for (int i = 0; i < 3; i++) {

                Scanner scan = new Scanner(System.in);
                System.out.println(" Введите число от 1 до 9: ");
                int a = scan.nextInt();

                if (a > x) {
                    System.out.println(" Ваше число больше! Повторите попытку.");
                } else if (a < x) {
                    System.out.println(" Ваше число меньше! Повторите попытку.");
                } else if (a == x) {
                    System.out.println(" Вы угадали число! Поздравляю!");
                }

            }

            System.out.println(" Хотите попробавать ещё раз? ");
            Scanner scan2 = new Scanner(System.in);
            System.out.println(" Да - введите 1, Нет - введите 0 ");
            int b = scan2.nextInt();

            if (b == 1) {

            } else if (b == 0) {
                break;
            }


        }
    }

// 2ое задание под звёздочкой не готово, пока не понимаю как его сделать(.
    private static void guessWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "broccoli", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println(" Выберите слово из представленных ниже: \n");
        System.out.println(" apple " + "| orange " + "| lemon " + "| banana " + "| peanut");
        System.out.println(" apricot " + "| avocado " + "| broccoli " + "| cherry " + "| pear");
        System.out.println(" garlic " + "| grape " + "| melon " + "| leak " + "| kiwi");
        System.out.println(" mango " + "| mushroom " + "| nut " + "| olive " + "| pea");
        System.out.println(" pepper " + "| pineapple " + "| pumpkin " + "| potato \n");

        Random random = new Random();
        int wordsLenght = words.length;

        int randWords = random.nextInt(wordsLenght);
        String hiddenWord = words[randWords];

//        это для проверки рандомайзера
        System.out.println(hiddenWord);

        Scanner scan = new Scanner(System.in);
        System.out.println(" Введите это слово: ");

        String myWord = scan.nextLine();

        if (hiddenWord == myWord) {
            System.out.println(" Вы угадали!");
        } else {
            System.out.println(" Вы не угадали! Повторите попытку.");
        }
    }
}
