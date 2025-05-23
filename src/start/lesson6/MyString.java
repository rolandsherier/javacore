package start.lesson6;

public class MyString {
    public static void main(String[] args) {
        char symbol = 'a';
        String text = new String("\tHey");
        String text2 = new String("Hey");
// Для сравнения String  сравниваем через equals
// Используем == если мы ссылаемся на один и тот же объект
        System.out.println(text.equals(text2));

        System.out.println(text);
        System.out.println(text2);
    }
}
