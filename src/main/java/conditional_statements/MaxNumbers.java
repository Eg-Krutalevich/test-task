package conditional_statements;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.max;

/**
 * 5. Пользователь вводит в консоли три числа, выводим самое большое из них.
 * Сложность алгоритма O(1)
 */

public class MaxNumbers {

    public static int printMaxNumber(int a, int b, int c) {
        return (a > b) ? (max(a, c)) : (max(b, c));
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

                int result = printMaxNumber(a, b, c);
                System.out.println("Максимальное число: " + result);
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Введите корректное число");
                input.next();
            }
        }
        input.close();
    }
}
