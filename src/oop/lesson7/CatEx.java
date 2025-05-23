package oop.lesson7;

public class CatEx {
    public static void main(String[] args) {
        Cat cat = new Cat("black", 10, "Roland");
        System.out.println(cat);

        cat.moveCat("Барсик");

        String firstMethod = cat.catBehavior(true, true);
        System.out.println(firstMethod);

        cat.feed("Roland","Рыбу", "Корм");



    }
}
