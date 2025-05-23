package start.lesson6;

import java.util.Scanner;

public class TextBlock {
    public static void main(String[] args) {
//        Solutin 1
//        String name1 = "Юрий";
//        String name2 = "Петр";
//        String text = """
//                Привет, как тебя зовут?
//                Меня зовут %s. А тебя?
//                Меня зовут %s!
//                """.formatted(name1, name2);
//        System.out.println(text);
//

//        Solution 2
        System.out.println("Введите свое имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String result = """
                Привет, как тебя зовут?
                Меня зовут %s.
                """.formatted(name);
        System.out.println(result);

    }
}
