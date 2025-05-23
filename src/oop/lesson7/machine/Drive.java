package oop.lesson7.machine;

public class Drive {
    public static void main(String[] args) {
        // Создание объекта класса Car и инициализация его полей через конструктор
        // Cоздаем экземпляр класса Car
        Machine machine = new Machine("Yellow", "Lamborghini", 350);

        // Вывод всей информации об объекте car через переопределённый метод toString()
        System.out.println(machine);

        // Получение и вывод конкретного поля объекта — скорости автомобиля
        System.out.println(machine.speed);

        // Изменение значения поля speed и вывод нового значения
        machine.speed = 500;
        System.out.println(machine.speed);

        machine.moveCar("Bugatti");

//      Метод перегрузки (overload)
        String firstMethod = machine.race(false);
        System.out.println(firstMethod);

        String secondMethod = machine.race(false, true);
        System.out.println(secondMethod);

    }
}