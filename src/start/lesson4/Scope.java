package start.lesson4;

public class Scope {
    public static void main(String[] args) {
        double priceCar = 10000;
// Переменная будет видна внутри этих скобок, в которых скобок
        if (priceCar > 9000) {
            double oldPrice = priceCar;
            priceCar *= 0.95;
            System.out.println(oldPrice);
        }
        System.out.println(priceCar);
    }
}
