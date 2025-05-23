package start.lesson6;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello world!";
        // Перевод в верхний регистр
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        // Перевод в нижний регистр
        String textLower = text.toLowerCase();
        System.out.println(textLower);

        //    Сколько букв в моем слове в строке
        int length = text.length();
        System.out.println(length);

        //    Есть ли в тексте другой текст
        boolean containsHello = text.contains("Hello");
        System.out.println(containsHello);

        //    Замена всез кусков текста (подстроки) на другой текст
        String replaceText = text.replace("r", "a");
        System.out.println(replaceText);

        //    Повторить текст n раз
        String textRepited = text.repeat(10);
        System.out.println(textRepited);

        //    Разбить текст на массив Strings
        String names = "Yuri;Olga;Petr;Vasya";
        String[] split = names.split(";");
        System.out.println(Arrays.toString(split));

        // Объединение строк (конкатинация)
        String word1 = "hi ";
        String word2 = "friend";
        String result = word1 + word2;
        System.out.println(result);


        // Начинается на подстроку
        boolean startsWithHel = text.startsWith("Hel");
        System.out.println(startsWithHel);


        // Заканчивается ли он на под строку "world!"?
        boolean endWith = text.endsWith("world!");
        System.out.println(endWith);

        // Обрезка строки - первые 5 символов
        // укажем начальную и конченую позицию
        String getFirstFiveLetters = text.substring(0, 5);
        System.out.println(getFirstFiveLetters);

        String lengthText2 = "hello".replaceAll("l", "a").toUpperCase();
        System.out.println(lengthText2);
    }
}
