package oop.lesson7.test;

public class TestEx {
    public static void main(String[] args) {
        Test test = new Test(100, "iPhone", "black");

        System.out.println(test); // Получаем общие данные

//        GETTER
        System.out.println(test.getPrice()); // Получаем для приватные данные

//        SETTER
        test.setModel("Nexus");
        String newModel = test.getModel();
        System.out.println(newModel);

    }
}
