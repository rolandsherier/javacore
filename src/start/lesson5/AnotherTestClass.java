package start.lesson5;

import java.util.Arrays;

public class AnotherTestClass {
    public static void main(String[] args) {
        String[] company = new String[3];
        company[0] = "Intel";
        company[1] = "AMD";
        company[2] = "Apple";
        System.out.println(Arrays.toString(company));
        
        
        int[] balance = {100, 200, 300};
        System.out.println(Arrays.toString(balance));

        int newElement = 400;

        int[] newBalance = new int[balance.length + 1];
        for (int i = 0; i < balance.length; i++) {
            newBalance[i] = balance[i];
        }
        newBalance[newBalance.length -1] = 1000;
        System.out.println(Arrays.toString(newBalance));


/*        Задача 3:
        1. Создаем массив
        2. Добавляем к массиву строку
        3. Выводим каждый элемент массива на экран с помощью forEach */

        String[] namesArray = {"Marina", "Nazi", "Zina"};
        String newNamesElement = "Roland";

        String[] newNamesArray = new String[namesArray.length + 1];
        int count = 0;
        for (String i : namesArray) {
            newNamesArray[count] = namesArray[count];
            System.out.println(Arrays.toString(newNamesArray));
        }
    }
}
