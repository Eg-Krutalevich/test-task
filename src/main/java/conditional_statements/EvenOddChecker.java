package conditional_statements;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 7. Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или
 * нечетное
 * Сложность алгоритма O(1)
 */

public class EvenOddChecker {

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Четное число";
        }
        return "Нечетеное число";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите число: ");
                int number = input.nextInt();

                String result = checkEvenOdd(number);
                System.out.println(result);
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Введите корректное число");
                input.next();
            }
        }
        input.close();
    }
}
