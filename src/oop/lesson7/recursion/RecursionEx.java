package oop.lesson7.recursion;

public class RecursionEx {
    public static void main(String[] args) {
        //    Задача: Посчитать сумму всех чисел от 1 до значения k
        int k = 2;
        Recursion recursion = new Recursion();
        int result = recursion.sum(k);
        System.out.println(result);
    }
}