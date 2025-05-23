package start.lesson6;

public class FormatPractice {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15000.00;
        boolean hasAutomaticTransmission = false;

        // Задача: С помощью String format слсьавть строку:
        // Привет, я менеджер салона [Имя бренда]
        // У нас есть модель - [Имя модели] за [Цена]
        // Есть ли у нее автоматическая коробка передач?
        // [Да/Нет]


////        Solution 1
//        if (hasAutomaticTransmission == true) {
//            System.out.printf("Привет, я менеджер салона %s." +
//                    "\nУ нас есть модель - %s за %.2f" +
//                    "\nЕсть ли у нее автоматическая коробка передач? - Да", carMark, carModel, price);
//        } else {
//            System.out.printf("Привет, я менеджер салона %s." +
//                    "\nУ нас есть модель - %s за %.2f" +
//                    "\nЕсть ли у нее автоматическая коробка передач? - Нет\n", carMark, carModel, price);
//        }


//        Solution 2
        String result = """
                Привет я менеджер салона %s
                У нас есть модель - %s за %.2f
                Есть ли у нее автоматическая коробка передач? 
                %s
                """.formatted(carMark, carModel, price, hasAutomaticTransmission ? "Да" : "Нет");
        System.out.println(result);
    }
}
