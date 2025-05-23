package start.lesson5;

public class ForEach {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

//        Перебор массива с помощью ForEach
        for (int i : num) {
            System.out.println(i);
        }

//        Найти четное значение
        int[] value = new int[1];
        for (int x : num) {
            if (x % 2 == 0) {
                value[0] = x;
                System.out.println("Четное значение " + value[0]);
            }
        }
    }
}
