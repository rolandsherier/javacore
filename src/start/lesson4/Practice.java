package start.lesson4;

public class Practice {
    public static void main(String[] args) {
        // Проверить работоспособность машины: Engine, Transmission - работает
        // Хотябы 3 колеса не проколоты из 4-х
        // Если машина не проколота, вывести на экран что машина готова к работает, иначе машина сломана

        boolean isWorkEngine = true;

        boolean isTransmission = true;

        boolean isFineWheel1 = true;
        boolean isFineWheel2 = true;
        boolean isFineWheel3 = false;
        boolean isFineWheel4 = false;

        int countFineWheels = 0;
        countFineWheels += isFineWheel1 ? 1 : 0;
        countFineWheels += isFineWheel2 ? 1 : 0;
        countFineWheels += isFineWheel3 ? 1 : 0;
        countFineWheels += isFineWheel4 ? 1 : 0;

        if (isWorkEngine && isTransmission && (countFineWheels >= 3)) {
            System.out.println("Машина готова к эксплуатации");
        } else {
            System.out.println("Машина сломана");
        }
    }
}
