package start.lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        
        int x = 5;
        int y = x;
        x = 10; // или y = 10
        System.out.println(x);
        System.out.println(y);

//        Этот пример отражает - что вышеупомянутый пример переприсваивания тут не рабортает, так как тут другой принцип - ссылки на область памяти heap где если изменить array2, то тут меняется вся область памяти.
//        int[] array = {x, y};
//        int[] array2 = array;
//        array2[0] = 13;
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));

//        Решение проблемы
        int[] array = {x, y};
        int[] array2 = new int[2]; // в [2] - это размерность массива
        array2[0] = array[0];
        array2[1] = array[1];
        array2[0] = 13;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }
}
