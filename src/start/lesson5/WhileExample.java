package start.lesson5;

public class WhileExample {
    public static void main(String[] args) {

        int number = 0;

        System.out.println("Solution 1");
        while (number < 100) {
            number++;
            System.out.println(number);
        }

        System.out.println("\nSolution 2");
//        We need use break, because number will be endless
        while(true) {
            number++;
            System.out.println(number);
            if (number == 1000) {
                break;
            }
        }
    }
}
