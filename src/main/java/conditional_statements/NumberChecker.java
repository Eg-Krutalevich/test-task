package conditional_statements;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
 * “Число больше десяти”, если меньше – “Число меньше десяти”
 * Сложность алгоритма O(1)
 */

public class NumberChecker {
    public static String checkNumber(int number) {
        if (number > 10) {
            return "Число больше десяти";
        }
        return "Число меньше десяти";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число: ");

            try {
                int number = input.nextInt();
                System.out.println(checkNumber(number));
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Введите корректное число");
                input.next();
            }
        }
        input.close();
    }
}