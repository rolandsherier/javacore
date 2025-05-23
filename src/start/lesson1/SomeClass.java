package start.lesson1;

import start.lesson0.GetRandomNumber;

public class SomeClass {
    public static void main(String[] args) {
        int someVar = GetRandomNumber.getRandomDiceNumber(7);
        System.out.println(someVar);
    }
}
