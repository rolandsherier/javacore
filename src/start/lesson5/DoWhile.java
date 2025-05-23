package start.lesson5;

public class DoWhile {
    public static void main(String[] args) {
        /*
    Сначало будем делать какое-л действие, после проверять - это действие соответствует условию.
       Действие которое при любых обстоятельствах я  сделаю.
        Данный вариант хорошо использовать чтобы программа отработала бы в начале а потом уже сравнивала результат
*/
        int count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count < 0);

        System.out.println("Проверка неработоспособности while");
        while (count < 0) {
            System.out.println(count);
        }
    }
}

