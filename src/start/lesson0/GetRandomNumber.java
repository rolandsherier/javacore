package start.lesson0;

// Рандомное число может прийти от 0
public class GetRandomNumber {
    public static int getRandomDiceNumber(int range) {
       return (int) (Math.random() * range) + 1;
    }
}
