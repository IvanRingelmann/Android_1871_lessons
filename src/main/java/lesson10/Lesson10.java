package lesson10;

import java.util.HashMap;
import java.util.Map;

public class Lesson10 {

    public static void main(String[] args) {

        task1();
        task2();
    }
    private static void task1() {

        String[] words =
                {"волейбол ", "баскетбол ", "шахматы ", "шашки ", "футбол ",
                "теннис ", "сквош ", "шахматы ", "марафон ", "шашки ",
                "шахматы ", "карате ", "сквош ", "шахматы ", "волейбол "};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");
    }

    private static void task2() {

        Phonebook phonebook = new Phonebook();

        phonebook.add(123456789, "Иванов");
        phonebook.add(234567890, "Иванов");
        phonebook.add(345678901, "Петров");
        phonebook.add(456789012, "Сидоров");
        phonebook.add(567890123, "Сидоров");
        phonebook.add(678901234, "Васечкин");

        phonebook.get("Иванов");
        phonebook.get("Рингельман");
        phonebook.get("Петров");
        phonebook.get("Васечкин");
    }
}

