package start.lesson6;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        // 1. Выбрать текст начиная с 11 символа до конца строки
        // 2. Перевести  в нижний регистр
        // 3. Разбить строку на массив по пробелу
        // 4. Вывести на экран каждое слово из массива
        // 5. Длину строки этого слова.
        String text = "my mame is Giovanni Giorgio";

        // Solution
        String[] getElevenString = text.substring(11).toLowerCase().split(" ");
        System.out.println("Длина слова " + Arrays.toString(getElevenString).length());

        for (String words : getElevenString) {
            System.out.println(words);
            System.out.println(words.length());
        }

    }
}
