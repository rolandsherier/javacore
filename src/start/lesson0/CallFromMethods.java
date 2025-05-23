package start.lesson0;

public class CallFromMethods {
    public static void main(String[] args) {
        int randomNumber = GetRandomNumber.getRandomDiceNumber(6);
        System.out.println(randomNumber);
    }
}