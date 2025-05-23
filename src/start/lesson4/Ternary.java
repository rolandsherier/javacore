package start.lesson4;
import start.lesson0.GetRandomNumber;
import start.lesson0.GetRandomNumber;


public class Ternary {
    public static void main(String[] args) {
        // Вызов класса Experiment без импорта, так как он в корневом пакете
        int money = GetRandomNumber.getRandomDiceNumber(100); //случайное число от 1 до 100
        int breadPrice = 20;
        int moneyAfterShopping = money - breadPrice;
        int childMoney = moneyAfterShopping >= 50 ? 10 : 5;
        moneyAfterShopping -= childMoney; // Уменьшаем деньги после покупок на сумму, данную ребенку

        System.out.println("Сумма карманных: " + childMoney);   // Выводим сумму, данную ребенку
        System.out.println("Сумма оставшися денег: " + moneyAfterShopping); // Выводим оставшиеся деньги
    }
}