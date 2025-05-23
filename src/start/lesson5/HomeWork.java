package start.lesson5;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
//        Первый способ объявления массива и перезапись его с использованием new подставив емкость массива.
        String[] countries = new String[4];
        countries[0] = "Doha";
        countries[1] = "New York";
        countries[2] = "Tbilisi";
        System.out.println(Arrays.toString(countries)); // [Doha, New York, Tbilisi, null]
//        Способ вывода одного элемента массива
        System.out.println(countries[0]); // Doha


//        Второй способ создания массива
        int[] numbers = {10, 20, 30};
        System.out.println(Arrays.toString(numbers));


//      РАЗДЕЛ: МОДИФИКАЦИИ МАССИВОВ

//      МОДИФИКАЦИЯ: Заполяем все эелементы массива словом Unknown

        Arrays.fill(countries, "Unknown"); // все будет Unknown
        System.out.println(Arrays.toString(countries));


//      МОДИФИКАЦИЯ: Добавляем в конец массива какой либо элемента
//      Создаем массив
        String[] languages = {"Georgina", "Latin", "Arabic"};
        System.out.println(Arrays.toString(languages));

//        Создаем новый элемент для будущего добавления
        String newElement = "Sweden";

//      Размер массива newArray становится больше на 1 ед. При этом, массив languages не может поменяться из за особенностей java
        String[] newArray = new String[languages.length + 1];

        System.out.println("====== Запуск цикла ======");
        for (int i = 0; i < languages.length; i++) {
            newArray[i] = languages[i];
            System.out.println(Arrays.toString(newArray));
        }

        System.out.println("====== Добавляем новый элемент ======");
//        Последний элемент в Java  это "- 1" то есть мы говорим что нужно добавить newElement в конец.
//        Следующая запись "-2", говорим что нужно добавить впред последний элемент.

//        newArray.length - 1 — это индекс последней ячейки
        newArray[newArray.length - 4] = newElement;
        System.out.println(Arrays.toString(newArray));


//      Еще пример добавления в массив нового элемента
        String[] cars = new String[3];
        cars[0] = "Mersedes";
        cars[1] = "BMW";
        cars[2] = "Volvo";
        System.out.println(Arrays.toString(cars));

        String newCar = "Lamborgini";
//
//        Копируем только размерность массива cars в массив addElementInNewArray
        String[] addElementInNewArray = new String[cars.length + 1];
        System.out.println(Arrays.toString(addElementInNewArray));

//        Теперь с помощью цикла for берем каждый элемент массива и копируем в новый массив, останется пустой 1 элемент
        for (int i = 0; i < cars.length; i++) {
            addElementInNewArray[i] = cars[i];
            System.out.println(Arrays.toString(addElementInNewArray));
        }

//        В пустом элементе добавляем к концу элемент Lamborgini
        addElementInNewArray[addElementInNewArray.length - 1] = newCar;
        System.out.println(Arrays.toString(addElementInNewArray));


        char[] answer = new char[4];
        answer[0] = 'D';
        answer[1] = 'o';
        answer[2] = 'h';
        answer[3] = 'a';

        System.out.println(Arrays.toString(answer));


//        ЗАДАЧА: Распечатать все четные числа
        int[] allNumbers = {3, 2, 10, 5, 8};

/*
        // Способ 1
        for (int i = 0; i < allNumbers.length; i++) {
            if (allNumbers[i] % 2 == 0) {
                System.out.println(allNumbers[i]);
            }
        }
*/
//        Способ 2
        int[] evenNumbers = new int[allNumbers.length];
        int index = 0; //

        for (int i = 0; i < allNumbers.length; i++) {
            if (allNumbers[i] % 2 == 0) {
                evenNumbers[index] = allNumbers[i];
                index++;
            }
        }
        evenNumbers = Arrays.copyOf(evenNumbers, index); // обрезаем до актульаного значения
        System.out.println(Arrays.toString(evenNumbers));


//        Способ 3 FOR EACH
        for (int i : allNumbers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("=====================================================");
/*
        Практическое задание
        Распечатать все элементы под четными индексами из массива numbers
*/      int num = 3;
        int newIndex = -1;
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++){
            newIndex = i;
        }
        System.out.println(index);
    }
}