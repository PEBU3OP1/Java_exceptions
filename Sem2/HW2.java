import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * HW2
 */
public class HW2 {

    public static void main(String[] args){
        task4();
    }

    public static void task1() {
        while (true) {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Введите дробное число: ");
            try {
                float sc = scnr.nextFloat();
                System.out.println(sc);
                break;

            } catch (InputMismatchException e) {

                System.out.println("Неверный формат!");
            }

        }
    }

    /*
     * Задание 2 исправить код
     * можно сделать так, тогда try-catch не нужен, будет выдавать Infinity
     */
    public static void task2() {
        try {
            int d = 0;
            int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    /*
     * Задание 3 исправить код
     * поудалял лишние исключения, кое-что поменял местами
     * NullPointer нужен только в такой ситуации, но при нач усолвиях тоже бы удалил
     */
    public static void task3() {
        try {
            int a = 90;
            int b = (Integer) null;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }


    /*
     * Задание4
     * В данном примере пустую строку отлавливает NumberFormatException, однако, чтобы выдавалось отдельное сообщение, проверяю на пустоту отдельно
     */
    public static void task4() {
        while (true) {
            Scanner scnr = new Scanner(System.in);
            System.out.print("Введите число: ");
            try {
                String sc = scnr.nextLine();
                if (sc.isEmpty()) {
                    System.out.println("Строка пуста!");
                    continue;
                }
                int ssc = Integer.parseInt(sc);
                System.out.println(ssc);
                break;

            } catch (NumberFormatException e) {

                System.out.println("Неверный формат!");
            }

        }
    }


}