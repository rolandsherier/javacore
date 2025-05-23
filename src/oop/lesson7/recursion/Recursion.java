package oop.lesson7.recursion;

public class Recursion {
    public int sum(int number) {
        if (number < 1) {
            return 0;
        }
        int result = number + sum(number - 1);
        return result;
    }
}

/*
Пошаговое выполнение sum(2):

1. Вызов: sum(2)
    → вызывает sum(1)
        → вызывает sum(0)
            → возвращает 0  (базовый случай)

2. Возврат вверх:
    sum(1) = 1 + 0 = 1
    sum(2) = 2 + 1 = 3

ИТОГО:
sum(2) = 3
*/