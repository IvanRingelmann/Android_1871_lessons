package lesson5;

public class worker {

    String name;
    String position;
    String email;
    String mobile;
    int salary;
    int age;


    public worker(String name, String position, String email, String mobile, int salary, int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
        this.age = age;

    }

    protected void printWorker() {

        System.out.println("ФИО: " + name + "|" + " Должность: " +
                position + "|" + " Email: " + email + "|" +
                " Зарплата: " + salary + "|" +" Возраст: " + age + "|");

    }

}
