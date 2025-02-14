package conditional_statements;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 4. Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль
 * количество отрицательных и положительных чисел
 * Сложность алгоритма O(1)
 */

public class Counter {

    public static void countNumbers(int a, int b, int c, int d) {
        int positiveCount = 0;
        int negativeCount = 0;

        positiveCount += (a > 0) ? 1 : 0;
        negativeCount += (a < 0) ? 1 : 0;

        positiveCount += (b > 0) ? 1 : 0;
        negativeCount += (b < 0) ? 1 : 0;

        positiveCount += (c > 0) ? 1 : 0;
        negativeCount += (c < 0) ? 1 : 0;

        positiveCount += (d > 0) ? 1 : 0;
        negativeCount += (d < 0) ? 1 : 0;

        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите первое число: ");
                int a = input.nextInt();

                System.out.print("Введите второе число: ");
                int b = input.nextInt();

                System.out.print("Введите третье число: ");
                int c = input.nextInt();

                System.out.print("Введите четвертое число: ");
                int d = input.nextInt();

                countNumbers(a, b, c, d);
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Введите корректное число");
                input.next();
            }
        }
        input.close();
    }
}