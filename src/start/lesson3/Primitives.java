package start.lesson3;

public class Primitives {
    public static void main(String[] args) {
        //    Будевые значения true / false
        boolean anwserYouri = true;
        boolean answerIraqli = false;

        //Byte - байт - это последовательность из 8 битов
        byte maxValue = 127;
        byte minByte = -128;

        //Short - состоит из 2 байт или из 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;

        // Integer - целое  число, состоит из 4 байт или из 32 битов
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;

        // Long - число из 8 байт или из 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        // Double - число с плавающей точке, 64 бит
        double myBottle = 1.5;

        // Float - число с плавающей точккой, 32 бит
        float cola = 0.33F;

        // Распечатывается первые 16 чисел, далее округление
        double doubleNumber = 1.12345678901234567890;
        // Распечатаются первые 6 чисел после запятой, далее округление
        float floatNumber = 1.12345678901234567890F;
        System.out.println(doubleNumber);
        System.out.println(floatNumber);

        // Char - character (символ), 16 бит ограничен 65_535 символами.
        System.out.println("Hello");
        char letter = 9;

        char newLine = '\n';
        System.out.print("a");
        System.out.println(newLine);
        System.out.print("b\n");

        char tab = '\t';
        char escape = '\\';
        System.out.println(escape);
    }
}