package start.lesson5;

public class ForI {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 10, 5, 8};

//        Выведем только четные числа (которые делятся на 2 без остатка)

        System.out.println("\nSolution 1");
        for (int i = 0; i < numbers.length; i++) {
            int resultOne = 0;
            if (resultOne == numbers[i] % 2) {
                System.out.println(numbers[i]);
            }
        }

        System.out.println("\nSolution 2");
        for (int number : numbers) {
            if (number % 2 == 0){
                System.out.println(number);
            }
        }


    }
}
