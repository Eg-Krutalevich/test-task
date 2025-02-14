package conditional_statements;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * 6. Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
 * наибольшего и наименьшего из них
 * Сложность алгоритма O(1)
 */

public class SumNumbers {

    public static int printSumMaxMin(int a, int b, int c) {
        int maxNumber = (a > b) ? (max(a, c)) : (max(b, c));
        int minNumber = (a < b) ? (min(a, c)) : (min(b, c));

        int sum = maxNumber + minNumber;
        return sum;
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

                int result = printSumMaxMin(a, b, c);
                System.out.println("Сумма максимального и минимального чисел: " + result);
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Введите корректное число");
                input.next();
            }
        }
        input.close();
    }
}