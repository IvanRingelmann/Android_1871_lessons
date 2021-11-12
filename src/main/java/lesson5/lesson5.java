package lesson5;

public class lesson5 {

    public static void main(String[] args) {

        worker[] perArray = new worker[5];

        perArray[0] = new worker("Бурков Даниил", "Аналитик", "test@mail.ru", "89851234567", 95000, 39);
        perArray[1] = new worker("Петров Иван", "Директор", "test@mail.ru", "89851234567", 120000, 45);
        perArray[2] = new worker("Сидоров Иван", "Заместитель директора", "test@mail.ru", "89851234567", 110000, 44);
        perArray[3] = new worker("Иванов Владимир", "Тестер", "test@mail.ru", "89851234567", 100000, 32);
        perArray[4] = new worker("Козлов Анатолий", "Менеджер", "test@mail.ru", "89851234567", 90000, 50);

        for (int i = 0; i < perArray.length; i++) {
            if (perArray[i].age > 40) {
                perArray[i].printWorker();
            }
        }


    }

}
