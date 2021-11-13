package lesson6;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Васька", 200, 5 ),
                new Cat("Мурзик", 200, 0),
                new Dog("Мухтар", 500, 10),
                new Dog("Тузик", 200, 3),
                new Dog("Чак", 10000, 10),
                new Cat("Мурка", 0, 0),
        };

        for (Animal i : animals) {
            i.run(201);
            i.swim(5);
        }

        System.out.println(" Считаем животных: " + Animal.count);
        System.out.println(" Кошек: " + Cat.count);
        System.out.println(" Собак: " + Dog.count);


    }

}
