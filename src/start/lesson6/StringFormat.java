package start.lesson6;

public class StringFormat {
    public static void main(String[] args) {
//        https://www.geeksforgeeks.org/format-specifiers-in-java/
        String name = "Юрий";
        int age = 30;

        // Задача: вывести "Меня зовут юрий и мне 30 лет."

        // Решение 1
        String phrase1 = "Меня зовут " + name + ". Мне " + age + " лет.";
        System.out.println(phrase1);

        // Решение 2
        // Есть спец символы %s - строка, %d - число
        String phrase2 = String.format("Меня зовут %s. Мне %d лет.", name, age);
        System.out.println(phrase2);

        // Решение 3
        System.out.printf("Меня зовут %s. Мне %d лет.", name, age);
    }
}
