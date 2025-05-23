package oop.lesson7;

public class DogEx {
    public static void main(String[] args) {
        Dog dog = new Dog("Muhtar", 10, "Peter");
        System.out.println(dog);

//        Устанавливаем данные используя setter
        dog.setWeight(-1); // тут срабатывает защита, которая не позволяет отрицательные значения подставлять
        System.out.println(dog);

        System.out.println(dog.getOwner());


//        Вызываем без параметров с использованием перегрузки. То есть если мы не передаем параметры то, значения будут по умолчанию
        Dog dog1 = new Dog();
        System.out.println(dog1);

    }
}