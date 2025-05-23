package start.lesson5;

public class MultiArray {
    public static void main(String[] args) {
//        int[] firstArray = {10, 20, 30, 40};
//        int[] secondArray = {50, 60, 70, 80};
//
////        Задача: Необходимо по порядку выстроить  массивы
//        System.out.println("Solution 1");
//        for (int numberOne : firstArray) {
//            System.out.println(numberOne);
//            for (int numberTwo : secondArray) {
//                System.out.println(numberTwo);
//            }
//        }

//        Задача: Найти число 178
        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 195, 193};

        int[][] complexArray = {group1, group2};
//        В начале используем int[] - это двумерный массив а в нем два массива
//        На второй итерации int так как там уже одномерный массив

        upperFor:
        for (int[] arrayOne : complexArray){
            for (int number : arrayOne) {
                if (number == 178) {
                    System.out.println("Нашли цифру");
//                    break upperFor;
                }else {
                    System.out.println("Не так цифра");
                }
            }
        }
    }
}
