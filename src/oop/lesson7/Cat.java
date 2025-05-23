package oop.lesson7;

import java.util.Arrays;

public class Cat {
    public String color;
    int age;
    private String owner;

    public Cat(String catColor, int catAge, String catOwner) {
        this.color = catColor;
        this.age = catAge;
        this.owner = catOwner;
    }

    public void moveCat(String catName) {
        System.out.printf("%s пошел в неизвестность \n", catName);
    }


    // Первая перегрузка — 1 параметр
    public String catBehavior(boolean isAwake) {
        if (isAwake) {
            return "Кот проснулся и ищет еду";
        } else {
            return "Кот спит";
        }
    }

    // Вторая перегрузка — 2 параметра
    public String catBehavior(boolean isAwake, boolean isHungry) {
        if (!isAwake) {
            return "Кот спит";
        }

        if (isHungry) {
            return "Кот бодрствует и хочет есть";
        } else {
            return "Кот бодрствует и не голоден";
        }
    }

// VarArgs - всегда должен быть последним в аргументе
    public void feed(String giver, String ...product) {
        System.out.printf("Молодой %s накормил а кот поел: %s", giver, Arrays.toString(product));
    }


    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }
}
