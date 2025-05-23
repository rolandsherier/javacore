package start.lesson4;
import start.lesson0.GetRandomNumber;

public class Switch {
    public static void main(String[] args) {

        //1 - понелельник ... 7 - воскресенье
        int numberDay = GetRandomNumber.getRandomDiceNumber(7);
        System.out.println(numberDay);

//        Стандартный способ
        switch (numberDay) {
//            case 1 -> System.out.println("Понедельник"); // Новый способ
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
//            default -> System.out.println("Данного дня не существует");
            default:
                System.out.println("Данного дня не существует");
        }



//        Плохая запись
//        if (numberDay == 1) {
//            System.out.println("Понедельник");
//        } else if (numberDay == 2) {
//            System.out.println("Вторник");
//        }

    }
}
