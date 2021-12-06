package lesson11;

import java.util.ArrayList;
import java.util.Arrays;


public class Lesson11 {

    /*
1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
2. Написать метод, который преобразует массив в ArrayList;
3. Задача: Даны классы Fruit, Apple extends Fruit, Orange extends Fruit; Класс Box, в который можно
складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить
и яблоки, и апельсины; Для хранения фруктов внутри коробки можно использовать ArrayList;
Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны); Внутри класса Box сделать метод compare(),
который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов:
 нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается,
 а в другую перекидываются объекты, которые были в первой; Не забываем про метод добавления фрукта в коробку.
 */

    public static void main(String[] args) {

// Задание 1
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C", "D", "E", "F"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);
// Задание 2
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);
// Задание 3
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();

        System.out.println("Задание 3: ");
        System.out.println("Добавление: ");

        or.addFruit(new Orange(),10);
        or1.addFruit(new Orange(),12);
        ap.addFruit(new Apple(),8);
        ap1.addFruit(new Apple(),4);

        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight() + "\n");

        System.out.println("Сравнение: ");
        System.out.println("Box 1 equals box 3: " + or.compare(ap));
        System.out.println("Box 2 equals box 4: " + or1.compare(ap1) + "\n");

        System.out.println("Пересыпка: ");
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("Пересыпка произведена!" + "\n");

        System.out.println("Считаем вес коробок: ");
        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight());


    }

    public static void swap(Object[] arr, int n1, int n2) {

        System.out.println("Задание 1: " + Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат замены: " + Arrays.toString(arr) + "\n___");
    }


    public static <T> void asList(T[]arr) {

        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Задание 2");
        System.out.println("Результат: " + alt + "\n___");
    }
}
