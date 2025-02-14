package cycles;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 2. Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х
 * Сложность алгоритма с циклом O(n)
 * Сложность алгоритма с Stream O(n)
 */

public class EvenChecker {

    public static void printEvenNumbersStream(int x) {
        IntStream.rangeClosed(0, x)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите число x (цикл): ");
                int xCycle = input.nextInt();

                for (int i = 0; i <= xCycle; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }

                System.out.print("Введите число x (Stream): ");
                int xStream = input.nextInt();

                printEvenNumbersStream(xStream);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное число");
                input.next();
            }
        }
        input.close();
    }
}
